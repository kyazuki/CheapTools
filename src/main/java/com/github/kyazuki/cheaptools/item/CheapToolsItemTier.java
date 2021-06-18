package com.github.kyazuki.cheaptools.item;

import java.util.function.Supplier;

import com.google.common.collect.Lists;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;

public enum CheapToolsItemTier implements IItemTier {
  WOODEN_DIAMOND(ItemTier.WOOD.getHarvestLevel(), ItemTier.DIAMOND.getMaxUses(), ItemTier.WOOD.getEfficiency(), ItemTier.WOOD.getAttackDamage(), ItemTier.DIAMOND.getEnchantability(), () -> {
    return Ingredient.merge(Lists.newArrayList(Ingredient.fromTag(ItemTags.PLANKS), Ingredient.fromItems(Items.DIAMOND)));
  }),
  DIAMOND_WOODEN(ItemTier.DIAMOND.getHarvestLevel(), ItemTier.WOOD.getMaxUses(), ItemTier.DIAMOND.getEfficiency(), ItemTier.DIAMOND.getAttackDamage(), ItemTier.WOOD.getEnchantability(), () -> {
    return Ingredient.merge(Lists.newArrayList(Ingredient.fromTag(ItemTags.PLANKS), Ingredient.fromItems(Items.DIAMOND)));
  });

  private final int harvestLevel;
  private final int maxUses;
  private final float efficiency;
  private final float attackDamage;
  private final int enchantability;
  private final LazyValue<Ingredient> repairMaterial;

  private CheapToolsItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
    this.harvestLevel = harvestLevelIn;
    this.maxUses = maxUsesIn;
    this.efficiency = efficiencyIn;
    this.attackDamage = attackDamageIn;
    this.enchantability = enchantabilityIn;
    this.repairMaterial = new LazyValue<>(repairMaterialIn);
  }

  public int getMaxUses() {
    return this.maxUses;
  }

  public float getEfficiency() {
    return this.efficiency;
  }

  public float getAttackDamage() {
    return this.attackDamage;
  }

  public int getHarvestLevel() {
    return this.harvestLevel;
  }

  public int getEnchantability() {
    return this.enchantability;
  }

  public Ingredient getRepairMaterial() {
    return this.repairMaterial.getValue();
  }
}
