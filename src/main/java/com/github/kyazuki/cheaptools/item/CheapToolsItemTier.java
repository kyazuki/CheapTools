package com.github.kyazuki.cheaptools.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum CheapToolsItemTier implements IItemTier {
    WOOD_STONE(ItemTier.WOOD.getHarvestLevel(), ItemTier.STONE.getMaxUses(), ItemTier.WOOD.getEfficiency(), ItemTier.WOOD.getAttackDamage(), ItemTier.STONE.getEnchantability(), ItemTier.WOOD::getRepairMaterial),
    STONE_WOOD(ItemTier.STONE.getHarvestLevel(), ItemTier.WOOD.getMaxUses(), ItemTier.STONE.getEfficiency(), ItemTier.STONE.getAttackDamage(), ItemTier.WOOD.getEnchantability(), ItemTier.STONE::getRepairMaterial),
    WOOD_IRON(ItemTier.WOOD.getHarvestLevel(), ItemTier.IRON.getMaxUses(), ItemTier.WOOD.getEfficiency(), ItemTier.WOOD.getAttackDamage(), ItemTier.IRON.getEnchantability(), ItemTier.WOOD::getRepairMaterial),
    IRON_WOOD(ItemTier.IRON.getHarvestLevel(), ItemTier.WOOD.getMaxUses(), ItemTier.IRON.getEfficiency(), ItemTier.IRON.getAttackDamage(), ItemTier.WOOD.getEnchantability(), ItemTier.IRON::getRepairMaterial),
    WOOD_GOLD(ItemTier.WOOD.getHarvestLevel(), ItemTier.GOLD.getMaxUses(), ItemTier.WOOD.getEfficiency(), ItemTier.WOOD.getAttackDamage(), ItemTier.GOLD.getEnchantability(), ItemTier.WOOD::getRepairMaterial),
    GOLD_WOOD(ItemTier.GOLD.getHarvestLevel(), ItemTier.WOOD.getMaxUses(), ItemTier.GOLD.getEfficiency(), ItemTier.GOLD.getAttackDamage(), ItemTier.WOOD.getEnchantability(), ItemTier.GOLD::getRepairMaterial),
    WOOD_DIAMOND(ItemTier.WOOD.getHarvestLevel(), ItemTier.DIAMOND.getMaxUses(), ItemTier.WOOD.getEfficiency(), ItemTier.WOOD.getAttackDamage(), ItemTier.DIAMOND.getEnchantability(), ItemTier.WOOD::getRepairMaterial),
    DIAMOND_WOOD(ItemTier.DIAMOND.getHarvestLevel(), ItemTier.WOOD.getMaxUses(), ItemTier.DIAMOND.getEfficiency(), ItemTier.DIAMOND.getAttackDamage(), ItemTier.WOOD.getEnchantability(), ItemTier.DIAMOND::getRepairMaterial);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    CheapToolsItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
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
