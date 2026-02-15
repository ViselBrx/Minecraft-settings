package com.myname.mymodid.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class SwordLightning extends SwordBase {
    public SwordLightning(ToolMaterial material) {
        super(material);
    }
    
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        World world = target.worldObj;
        if (!world.isRemote) {
            world.addWeatherEffect(new EntityLightningBolt(world, target.posX, target.posY, target.posZ));
        }
        return super.hitEntity(stack, target, attacker);
    }
}