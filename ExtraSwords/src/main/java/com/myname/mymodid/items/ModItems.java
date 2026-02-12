package com.myname.mymodid.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
    
    // MATERIAIS
    public static ToolMaterial MATERIAL_FIRE = EnumHelper.addToolMaterial("MATERIAL_FIRE", 2, 500, 6.0F, 2.0F, 10);
    public static ToolMaterial MATERIAL_ICE = EnumHelper.addToolMaterial("MATERIAL_ICE", 2, 500, 6.0F, 2.0F, 10);
    public static ToolMaterial MATERIAL_POISON = EnumHelper.addToolMaterial("MATERIAL_POISON", 2, 500, 6.0F, 2.0F, 10);
    
    // ESPADAS
    public static Item swordFire;
    public static Item swordIce;
    public static Item swordPoison;
    
    public static void registerItems() {
        swordFire = new SwordFire(MATERIAL_FIRE)
            .setUnlocalizedName("swordFire")
            .setTextureName("mymodid:swordFire");
        GameRegistry.registerItem(swordFire, "swordFire");
        
        swordIce = new SwordIce(MATERIAL_ICE)
            .setUnlocalizedName("swordIce")
            .setTextureName("mymodid:swordIce");
        GameRegistry.registerItem(swordIce, "swordIce");
        
        swordPoison = new SwordPoison(MATERIAL_POISON)
            .setUnlocalizedName("swordPoison")
            .setTextureName("mymodid:swordPoison");
        GameRegistry.registerItem(swordPoison, "swordPoison");
    }
    
    public static void registerRecipes() {
        // ESPADA DE FOGO: Blaze Rod + Graveto
        GameRegistry.addRecipe(new ItemStack(swordFire),
            " X ",
            " X ",
            " Y ",
            'X', Items.blaze_rod,
            'Y', Items.stick
        );
        
        // ESPADA DE GELO: Gelo + Graveto
        GameRegistry.addRecipe(new ItemStack(swordIce),
            " X ",
            " X ",
            " Y ",
            'X', Blocks.ice,
            'Y', Items.stick
        );
        
        // ESPADA DE VENENO: Olho de Aranha + Graveto
        GameRegistry.addRecipe(new ItemStack(swordPoison),
            " X ",
            " X ",
            " Y ",
            'X', Items.spider_eye,
            'Y', Items.stick
        );
    }
}