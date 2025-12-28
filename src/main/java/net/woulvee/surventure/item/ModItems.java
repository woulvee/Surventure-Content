package net.woulvee.surventure.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SmithingTemplateItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.woulvee.surventure.QuestItems;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(QuestItems.MODID);

    /* PORTALS */
    public static final DeferredItem<Item> NETHERPORTAL = ITEMS.register("mini_nether_portal",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ENDPORTAL = ITEMS.register("mini_end_portal",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DEEPDARK = ITEMS.register("mini_deepdark_portal",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TWILIGHT = ITEMS.register("mini_twilight_portal",
            () -> new Item(new Item.Properties().stacksTo(1)));

    /* ITEMS */
    public static final DeferredItem<Item> PRESSED_DIAMOND = ITEMS.register("pressed_diamond",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final DeferredItem<Item> REFINED_DIAMOND = ITEMS.register("refined_diamond",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredItem<Item> TWILIGHT_CRYSTAL = ITEMS.register("twilight_crystal",
            () -> new TwilightCrystalItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    /* TEMPLATES */
   public static final DeferredItem<Item> TWILIGHT_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("twilight_upgrade_smithing_template", () -> new SmithingTemplateItem(
            Component.translatable("item." + QuestItems.MODID + ".smithing_template.twilight_upgrade.applies_to").withStyle(ChatFormatting.BLUE),
            Component.translatable("item." + QuestItems.MODID + ".smithing_template.twilight_upgrade.ingredients").withStyle(ChatFormatting.BLUE),
            Component.translatable("upgrade." + QuestItems.MODID + ".twilight_upgrade").withStyle(ChatFormatting.GRAY),
            Component.translatable("item." + QuestItems.MODID + ".smithing_template.twilight_upgrade.base_slot_description"),
            Component.translatable("item." + QuestItems.MODID + ".smithing_template.twilight_upgrade.additions_slot_description"),
            List.of(
                   ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet"),
                   ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate"),
                   ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings"),
                   ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots"),
                   ResourceLocation.withDefaultNamespace("item/empty_slot_sword"),
                   ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe")
           ),
            List.of(ResourceLocation.parse("item/empty_slot_ingot"))
           )
    );



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
