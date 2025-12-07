package net.woulvee.surventure.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class TwilightCrystalItem extends Item {


    public TwilightCrystalItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {

        tooltipComponents.add(Component.translatable("tooltip.surventure.twilight_crystal.description"));

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
