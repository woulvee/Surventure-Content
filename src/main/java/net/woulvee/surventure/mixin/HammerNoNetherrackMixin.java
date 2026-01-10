package net.woulvee.surventure.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pro.mikey.justhammers.HammerItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(HammerItem.class)
public class HammerNoNetherrackMixin {
    @Inject(
            method = "canDestroy",
            at = @At("HEAD"),
            cancellable = true
    )
    private void cantDestroyNetherrack(BlockState targetState, Level level, BlockPos pos, CallbackInfoReturnable<Boolean> cir){
        if(targetState.getBlock() == Blocks.NETHERRACK){
            cir.setReturnValue(false);
        }
    }
}
