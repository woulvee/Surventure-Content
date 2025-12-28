package net.woulvee.surventure.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;


@EventBusSubscriber(modid = "surventure")
public class ItemPatcher {

    public static final ResourceLocation BASE_ATTACK_DAMAGE_ID = ResourceLocation.withDefaultNamespace("base_attack_damage");
    public static final ResourceLocation BASE_ATTACK_SPEED_ID = ResourceLocation.withDefaultNamespace("base_attack_speed");

    static final ResourceLocation fieryHelmet = ResourceLocation.fromNamespaceAndPath("twilightforest", "fiery_helmet");
    static final ResourceLocation fieryChestplate = ResourceLocation.fromNamespaceAndPath("twilightforest", "fiery_chestplate");
    static final ResourceLocation fieryLeggings = ResourceLocation.fromNamespaceAndPath("twilightforest", "fiery_leggings");
    static final ResourceLocation fieryBoots = ResourceLocation.fromNamespaceAndPath("twilightforest", "fiery_boots");
    static final ResourceLocation fieryPickaxe = ResourceLocation.fromNamespaceAndPath("twilightforest", "fiery_pickaxe");
    static final ResourceLocation fierySword = ResourceLocation.fromNamespaceAndPath("twilightforest", "fiery_sword");

    static final ResourceLocation kmHelmet = ResourceLocation.fromNamespaceAndPath("twilightforest", "knightmetal_helmet");
    static final ResourceLocation kmChestplate = ResourceLocation.fromNamespaceAndPath("twilightforest", "knightmetal_chestplate");
    static final ResourceLocation kmLeggings = ResourceLocation.fromNamespaceAndPath("twilightforest", "knightmetal_leggings");
    static final ResourceLocation kmBoots = ResourceLocation.fromNamespaceAndPath("twilightforest", "knightmetal_boots");
    static final ResourceLocation kmSword = ResourceLocation.fromNamespaceAndPath("twilightforest", "knightmetal_sword");
    static final ResourceLocation kmPickaxe = ResourceLocation.fromNamespaceAndPath("twilightforest", "knightmetal_pickaxe");
    static final ResourceLocation kmAxe = ResourceLocation.fromNamespaceAndPath("twilightforest", "knightmetal_axe");

    static final ResourceLocation slHelmet = ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_helmet");
    static final ResourceLocation slChestplate = ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_chestplate");
    static final ResourceLocation slLeggings = ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_leggings");
    static final ResourceLocation slBoots = ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_boots");
    static final ResourceLocation slSword = ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_sword");
    static final ResourceLocation slPickaxe = ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_pickaxe");
    static final ResourceLocation slAxe = ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_axe");
    static final ResourceLocation slHoe = ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_hoe");
    static final ResourceLocation slShovel = ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_shovel");

    static final ResourceLocation iwHelmet = ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_helmet");
    static final ResourceLocation iwChestplate = ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_chestplate");
    static final ResourceLocation iwLeggings = ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_leggings");
    static final ResourceLocation iwBoots = ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_boots");
    static final ResourceLocation iwSword = ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_sword");
    static final ResourceLocation iwPickaxe = ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_pickaxe");
    static final ResourceLocation iwAxe = ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_axe");
    static final ResourceLocation iwHoe = ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_hoe");
    static final ResourceLocation iwShovel = ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_shovel");

    static final ResourceLocation arHelmet = ResourceLocation.fromNamespaceAndPath("twilightforest", "arctic_helmet");
    static final ResourceLocation arChestplate = ResourceLocation.fromNamespaceAndPath("twilightforest", "arctic_chestplate");
    static final ResourceLocation arLeggings = ResourceLocation.fromNamespaceAndPath("twilightforest", "arctic_leggings");
    static final ResourceLocation arBoots = ResourceLocation.fromNamespaceAndPath("twilightforest", "arctic_boots");

    static final ResourceLocation blunderbuss = ResourceLocation.fromNamespaceAndPath("wildernature", "blunderbuss");

    static final ResourceLocation sonorous = ResourceLocation.fromNamespaceAndPath("deeperdarker", "sonorous_staff");


    @net.neoforged.bus.api.SubscribeEvent
    public static void modifyComponents(ModifyDefaultComponentsEvent event) {


        setDurability(event, fieryHelmet, 417);
        setDurability(event, fieryChestplate, 618);
        setDurability(event, fieryLeggings, 575);
        setDurability(event, fieryBoots, 503);
        setToolBase(event, fierySword, 8, 1.6, 2277);
        setToolBase(event, fieryPickaxe, 7, 1.2, 2277);

        setDurability(event, kmHelmet, 312);
        setDurability(event, kmChestplate, 468);
        setDurability(event, kmLeggings, 412);
        setDurability(event, kmBoots, 342);
        setToolBase(event, kmSword, 9, 1.4, 1375);
        setToolBase(event, kmAxe, 11, 1.0, 1375);
        setToolBase(event, kmPickaxe, 7, 1.2, 1375);

        setDurability(event, slHelmet, 220);
        setDurability(event, slChestplate, 320);
        setDurability(event, slLeggings, 300);
        setDurability(event, slBoots, 260);
        setToolBase(event, slSword, 7, 1.8, 512);
        setDurability(event, slPickaxe, 512);
        setDurability(event, slAxe, 512);
        setDurability(event, slHoe, 512);
        setDurability(event, slShovel, 512);


        setDurability(event, iwHelmet, 312);
        setDurability(event, iwChestplate, 468);
        setDurability(event, iwLeggings, 412);
        setDurability(event, iwBoots, 342);
        setDurability(event, iwSword, 1375);
        setDurability(event, iwPickaxe, 1375);
        setDurability(event, iwAxe, 1375);
        setDurability(event, iwHoe, 1375);
        setDurability(event, iwShovel, 1375);

        setDurability(event, arHelmet, 312);
        setDurability(event, arChestplate, 468);
        setDurability(event, arLeggings, 412);
        setDurability(event, arBoots, 342);

        setDurability(event, blunderbuss, 32);
        setDurability(event, sonorous, 10);
    }

    private static void setDurability(ModifyDefaultComponentsEvent event, ResourceLocation id, int maxDamage){

        Item item = BuiltInRegistries.ITEM.get(id);
        event.modify(item, builder ->
                builder.set(DataComponents.MAX_DAMAGE, maxDamage)
        );
    }

    private static void setToolBase(ModifyDefaultComponentsEvent event, ResourceLocation id, int damage, double attackSpeed, int maxDamage){

        Item item = BuiltInRegistries.ITEM.get(id);

        event.modify(item, builder -> {


            builder.set(DataComponents.ATTRIBUTE_MODIFIERS,
                    ItemAttributeModifiers.builder()
                            .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, damage-1, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                            .add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -(4-attackSpeed), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                            .build());
        });

        setDurability(event, id, maxDamage);
    }


}