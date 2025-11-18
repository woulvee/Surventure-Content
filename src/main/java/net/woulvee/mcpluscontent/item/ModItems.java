package net.woulvee.mcpluscontent.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.woulvee.mcpluscontent.QuestItems;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(QuestItems.MODID);

    public static final DeferredItem<Item> NETHERPORTAL = ITEMS.register("mini_nether_portal",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ENDPORTAL = ITEMS.register("mini_end_portal",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DEEPDARK = ITEMS.register("mini_deepdark_portal",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TWILIGHT = ITEMS.register("mini_twilight_portal",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TWILIGHT_CRYSTAL = ITEMS.register("twilight_crystal",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
