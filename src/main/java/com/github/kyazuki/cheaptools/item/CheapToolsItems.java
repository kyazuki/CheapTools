package com.github.kyazuki.cheaptools.item;

import com.github.kyazuki.cheaptools.CheapTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;

public class CheapToolsItems {
    public static Item
        WOODEN_STONE_SWORD,
        STONE_WOODEN_SWORD,
        WOODEN_IRON_SWORD,
        IRON_WOODEN_SWORD,
        WOODEN_GOLDEN_SWORD,
        GOLDEN_WOODEN_SWORD,
        WOODEN_DIAMOND_SWORD,
        DIAMOND_WOODEN_SWORD,
        WOODEN_STONE_PICKAXE,
        WOODEN_STONE_WOODEN_PICKAXE,
        STONE_WOODEN_PICKAXE,
        WOODEN_IRON_PICKAXE,
        WOODEN_IRON_WOODEN_PICKAXE,
        IRON_WOODEN_PICKAXE,
        WOODEN_GOLDEN_PICKAXE,
        WOODEN_GOLDEN_WOODEN_PICKAXE,
        GOLDEN_WOODEN_PICKAXE,
        WOODEN_DIAMOND_PICKAXE,
        WOODEN_DIAMOND_WOODEN_PICKAXE,
        DIAMOND_WOODEN_PICKAXE,
        WOODEN_STONE_AXE,
        WOODEN_STONE_WOODEN_AXE,
        STONE_WOODEN_AXE,
        WOODEN_IRON_AXE,
        WOODEN_IRON_WOODEN_AXE,
        IRON_WOODEN_AXE,
        WOODEN_GOLDEN_AXE,
        WOODEN_GOLDEN_WOODEN_AXE,
        GOLDEN_WOODEN_AXE,
        WOODEN_DIAMOND_AXE,
        WOODEN_DIAMOND_WOODEN_AXE,
        DIAMOND_WOODEN_AXE,
        WOODEN_STONE_HOE,
        STONE_WOODEN_HOE,
        WOODEN_IRON_HOE,
        IRON_WOODEN_HOE,
        WOODEN_GOLDEN_HOE,
        GOLDEN_WOODEN_HOE,
        WOODEN_DIAMOND_HOE,
        DIAMOND_WOODEN_HOE,
        RAINBOW_HELMET,
        RAINBOW_CHESTPLATE,
        RAINBOW_LEGGINGS,
        RAINBOW_BOOTS;

    private static void registerSwords(IForgeRegistry<Item> registry) {
        WOODEN_STONE_SWORD = register(registry, "wooden_stone_sword", new SwordItem(CheapToolsItemTier.WOOD_STONE, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
        STONE_WOODEN_SWORD = register(registry, "stone_wooden_sword", new SwordItem(CheapToolsItemTier.STONE_WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
        WOODEN_IRON_SWORD = register(registry, "wooden_iron_sword", new SwordItem(CheapToolsItemTier.WOOD_IRON, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
        IRON_WOODEN_SWORD = register(registry, "iron_wooden_sword", new SwordItem(CheapToolsItemTier.IRON_WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
        WOODEN_GOLDEN_SWORD = register(registry, "wooden_golden_sword", new SwordItem(CheapToolsItemTier.WOOD_GOLD, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
        GOLDEN_WOODEN_SWORD = register(registry, "golden_wooden_sword", new SwordItem(CheapToolsItemTier.GOLD_WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
        WOODEN_DIAMOND_SWORD = register(registry, "wooden_diamond_sword", new SwordItem(CheapToolsItemTier.WOOD_DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
        DIAMOND_WOODEN_SWORD = register(registry, "diamond_wooden_sword", new SwordItem(CheapToolsItemTier.DIAMOND_WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    }

    private static void registerPickaxes(IForgeRegistry<Item> registry) {
        WOODEN_STONE_PICKAXE = register(registry, "wooden_stone_pickaxe", new PickaxeItem(CheapToolsItemTier.WOOD_STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_STONE_WOODEN_PICKAXE = register(registry, "wooden_stone_wooden_pickaxe", new PickaxeItem(CheapToolsItemTier.STONE_WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        STONE_WOODEN_PICKAXE = register(registry, "stone_wooden_pickaxe", new PickaxeItem(CheapToolsItemTier.WOOD_STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_IRON_PICKAXE = register(registry, "wooden_iron_pickaxe", new PickaxeItem(CheapToolsItemTier.WOOD_IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_IRON_WOODEN_PICKAXE = register(registry, "wooden_iron_wooden_pickaxe", new PickaxeItem(CheapToolsItemTier.IRON_WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        IRON_WOODEN_PICKAXE = register(registry, "iron_wooden_pickaxe", new PickaxeItem(CheapToolsItemTier.WOOD_IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_GOLDEN_PICKAXE = register(registry, "wooden_golden_pickaxe", new PickaxeItem(CheapToolsItemTier.WOOD_GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_GOLDEN_WOODEN_PICKAXE = register(registry, "wooden_golden_wooden_pickaxe", new PickaxeItem(CheapToolsItemTier.GOLD_WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        GOLDEN_WOODEN_PICKAXE = register(registry, "golden_wooden_pickaxe", new PickaxeItem(CheapToolsItemTier.WOOD_GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_DIAMOND_PICKAXE = register(registry, "wooden_diamond_pickaxe", new PickaxeItem(CheapToolsItemTier.WOOD_DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_DIAMOND_WOODEN_PICKAXE = register(registry, "wooden_diamond_wooden_pickaxe", new PickaxeItem(CheapToolsItemTier.DIAMOND_WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        DIAMOND_WOODEN_PICKAXE = register(registry, "diamond_wooden_pickaxe", new PickaxeItem(CheapToolsItemTier.WOOD_DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    }

    private static void registerAxes(IForgeRegistry<Item> registry) {
        WOODEN_STONE_AXE = register(registry, "wooden_stone_axe", new AxeItem(CheapToolsItemTier.WOOD_STONE, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_STONE_WOODEN_AXE = register(registry, "wooden_stone_wooden_axe", new AxeItem(CheapToolsItemTier.STONE_WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        STONE_WOODEN_AXE = register(registry, "stone_wooden_axe", new AxeItem(CheapToolsItemTier.WOOD_STONE, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_IRON_AXE = register(registry, "wooden_iron_axe", new AxeItem(CheapToolsItemTier.WOOD_IRON, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_IRON_WOODEN_AXE = register(registry, "wooden_iron_wooden_axe", new AxeItem(CheapToolsItemTier.IRON_WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        IRON_WOODEN_AXE = register(registry, "iron_wooden_axe", new AxeItem(CheapToolsItemTier.WOOD_IRON, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_GOLDEN_AXE = register(registry, "wooden_golden_axe", new AxeItem(CheapToolsItemTier.WOOD_GOLD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_GOLDEN_WOODEN_AXE = register(registry, "wooden_golden_wooden_axe", new AxeItem(CheapToolsItemTier.GOLD_WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        GOLDEN_WOODEN_AXE = register(registry, "golden_wooden_axe", new AxeItem(CheapToolsItemTier.WOOD_GOLD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_DIAMOND_AXE = register(registry, "wooden_diamond_axe", new AxeItem(CheapToolsItemTier.WOOD_DIAMOND, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_DIAMOND_WOODEN_AXE = register(registry, "wooden_diamond_wooden_axe", new AxeItem(CheapToolsItemTier.DIAMOND_WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        DIAMOND_WOODEN_AXE = register(registry, "diamond_wooden_axe", new AxeItem(CheapToolsItemTier.WOOD_DIAMOND, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    }

    private static void registerHoes(IForgeRegistry<Item> registry) {
        WOODEN_STONE_HOE = register(registry, "wooden_stone_hoe", new HoeItem(CheapToolsItemTier.WOOD_STONE, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        STONE_WOODEN_HOE = register(registry, "stone_wooden_hoe", new HoeItem(CheapToolsItemTier.STONE_WOOD, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_IRON_HOE = register(registry, "wooden_iron_hoe", new HoeItem(CheapToolsItemTier.WOOD_IRON, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        IRON_WOODEN_HOE = register(registry, "iron_wooden_hoe", new HoeItem(CheapToolsItemTier.IRON_WOOD, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_GOLDEN_HOE = register(registry, "wooden_golden_hoe", new HoeItem(CheapToolsItemTier.WOOD_GOLD, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        GOLDEN_WOODEN_HOE = register(registry, "golden_wooden_hoe", new HoeItem(CheapToolsItemTier.GOLD_WOOD, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        WOODEN_DIAMOND_HOE = register(registry, "wooden_diamond_hoe", new HoeItem(CheapToolsItemTier.WOOD_DIAMOND, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
        DIAMOND_WOODEN_HOE = register(registry, "diamond_wooden_hoe", new HoeItem(CheapToolsItemTier.DIAMOND_WOOD, 0, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    }

    private static void registerArmors(IForgeRegistry<Item> registry) {
        RAINBOW_HELMET = register(registry, "rainbow_helmet", new ArmorItem(CheapToolsArmorMaterial.RAINBOW, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
        RAINBOW_CHESTPLATE = register(registry, "rainbow_chestplate", new ArmorItem(CheapToolsArmorMaterial.RAINBOW, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
        RAINBOW_LEGGINGS = register(registry, "rainbow_leggings", new ArmorItem(CheapToolsArmorMaterial.RAINBOW, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
        RAINBOW_BOOTS = register(registry, "rainbow_boots", new ArmorItem(CheapToolsArmorMaterial.RAINBOW, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));
    }

    public static void registerItems(IForgeRegistry<Item> registry) {
        registerSwords(registry);
        registerPickaxes(registry);
        registerAxes(registry);
        registerHoes(registry);
        registerArmors(registry);
    }

    private static Item register(IForgeRegistry<Item> registry, String key, Item item) {
        item.setRegistryName(new ResourceLocation(CheapTools.MODID, key));
        registry.register(item);
        return item;
    }
}
