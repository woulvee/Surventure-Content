package net.woulvee.surventure;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.woulvee.surventure.item.ModItems;

import java.util.function.Supplier;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, QuestItems.MODID);

    public static final Supplier<CreativeModeTab> QUESTITEMS_TAB = CREATIVE_MODE_TAB.register("questitems_tab",
            () -> CreativeModeTab.builder()
                    .icon( () -> new ItemStack(ModItems.NETHERPORTAL.get()))
                    .title(Component.translatable("itemGroup.surventure.questitems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.NETHERPORTAL);
                        output.accept(ModItems.ENDPORTAL);
                        output.accept(ModItems.DEEPDARK);
                        output.accept(ModItems.TWILIGHT);
                        output.accept(ModItems.TWILIGHT_CRYSTAL);
                        output.accept(ModItems.TWILIGHT_UPGRADE_SMITHING_TEMPLATE);
                        output.accept(ModItems.PRESSED_DIAMOND);
                        output.accept(ModItems.REFINED_DIAMOND);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
