package com.myname.mymodid.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class SwordWeakness extends SwordBase {
    public SwordWeakness(ToolMaterial material) {
        super(material);
    }
    
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.addPotionEffect(new PotionEffect(Potion.weakness.id, 140, 1)); 
        return super.hitEntity(stack, target, attacker);
    }
}