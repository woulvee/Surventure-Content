package net.woulvee.surventure.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.world.level.block.HorizontalDirectionalBlock.FACING;

@Mixin(BedBlock.class)
public class BedExplosionMixin {

    /**
     * Sorry, but no more Bed Explosions to expose Ancient Debris! It's just to easy.
     */

    @Inject(
            method = "useWithoutItem",
            at = @At("HEAD"),
            cancellable = true
    )
    private void onBedUse(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult, CallbackInfoReturnable<InteractionResult> cir) {
        if (!BedBlock.canSetSpawn(level)) {
            if (!level.isClientSide) {
                level.removeBlock(pos, false);
                BlockPos oppositePos = pos.relative(state.getValue(BedBlock.FACING).getOpposite());
                BlockState oppositeState = level.getBlockState(oppositePos);
                if (oppositeState.is(state.getBlock())) {
                    level.removeBlock(oppositePos, false);
                }
                Vec3 vec3 = pos.getCenter();
                level.explode(
                        null,
                        level.damageSources().badRespawnPointExplosion(vec3),
                        null,
                        vec3,
                        5.0F,
                        true,
                        Level.ExplosionInteraction.NONE
                );
            }
            cir.setReturnValue(InteractionResult.SUCCESS);
        }
    }
}
