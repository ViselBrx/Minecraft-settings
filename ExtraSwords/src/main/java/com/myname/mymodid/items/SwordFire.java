package com.myname.mymodid.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class SwordFire extends SwordBase {
    public SwordFire(ToolMaterial material) {
        super(material);
    }
    
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.setFire(7);
        return super.hitEntity(stack, target, attacker);
    }
}