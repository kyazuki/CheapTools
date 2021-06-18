package com.github.kyazuki.cheaptools.item;

import com.github.kyazuki.cheaptools.CheapTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;

public class CheapToolsItems {
  public static Item
      WOODEN_DIAMOND_SWORD,
      DIAMOND_WOODEN_SWORD,
      WOODEN_DIAMOND_PICKAXE,
      DIAMOND_WOODEN_PICKAXE,
      RAINBOW_HELMET,
      RAINBOW_CHESTPLATE,
      RAINBOW_LEGGINS,
      RAINBOW_BOOTS;

  public static void registerItems(IForgeRegistry<Item> registry) {
    WOODEN_DIAMOND_SWORD = register(registry, "wooden_diamond_sword", new SwordItem(CheapToolsItemTier.WOODEN_DIAMOND, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    DIAMOND_WOODEN_SWORD = register(registry, "diamond_wooden_sword", new SwordItem(CheapToolsItemTier.DIAMOND_WOODEN, 3, -2.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
    WOODEN_DIAMOND_PICKAXE = register(registry, "wooden_diamond_pickaxe", new PickaxeItem(CheapToolsItemTier.WOODEN_DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    DIAMOND_WOODEN_PICKAXE = register(registry, "diamond_wooden_pickaxe", new PickaxeItem(CheapToolsItemTier.DIAMOND_WOODEN, 1, -2.8F, (new Item.Properties()).group(ItemGroup.TOOLS)));
    RAINBOW_HELMET = register(registry, "rainbow_helmet", new ArmorItem(CheapToolsArmorMaterial.RAINBOW, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
    RAINBOW_CHESTPLATE = register(registry, "rainbow_chestplate", new ArmorItem(CheapToolsArmorMaterial.RAINBOW, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
    RAINBOW_LEGGINS = register(registry, "rainbow_leggins", new ArmorItem(CheapToolsArmorMaterial.RAINBOW, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
    RAINBOW_BOOTS = register(registry, "rainbow_boots", new ArmorItem(CheapToolsArmorMaterial.RAINBOW, EquipmentSlotType.FEET, (new Item.Properties()).group(ItemGroup.COMBAT)));
  }

  private static Item register(IForgeRegistry<Item> registry, String key, Item item) {
    item.setRegistryName(new ResourceLocation(CheapTools.MODID, key));
    registry.register(item);
    return item;
  }
}
