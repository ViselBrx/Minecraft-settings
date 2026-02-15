package com.myname.mymodid.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class SwordHunger extends SwordBase {
    public SwordHunger(ToolMaterial material) {
        super(material);
    }
    
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.addPotionEffect(new PotionEffect(Potion.hunger.id, 140, 1));
        return super.hitEntity(stack, target, attacker);
    }
}