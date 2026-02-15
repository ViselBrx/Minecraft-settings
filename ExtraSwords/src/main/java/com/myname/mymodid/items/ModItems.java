package com.myname.mymodid.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
    
    // MATERIAIS DAS ESPADAS
    public static ToolMaterial MATERIAL_FIRE = EnumHelper.addToolMaterial("MATERIAL_FIRE", 2, 500, 6.0F, 4.0F, 10);
    public static ToolMaterial MATERIAL_ICE = EnumHelper.addToolMaterial("MATERIAL_ICE", 2, 500, 6.0F, 4.0F, 10);
    public static ToolMaterial MATERIAL_POISON = EnumHelper.addToolMaterial("MATERIAL_POISON", 2, 500, 6.0F, 4.0F, 10);
    public static ToolMaterial MATERIAL_LIGHTNING = EnumHelper.addToolMaterial("MATERIAL_LIGHTNING", 2, 250, 8.0F, 4.0F, 10);
    public static ToolMaterial MATERIAL_WITHER = EnumHelper.addToolMaterial("MATERIAL_WITHER", 2, 400, 6.0F, 4.0F, 10);
    public static ToolMaterial MATERIAL_NAUSEA = EnumHelper.addToolMaterial("MATERIAL_NAUSEA", 2, 300, 6.0F, 4.0F, 10);
    public static ToolMaterial MATERIAL_HUNGER = EnumHelper.addToolMaterial("MATERIAL_HUNGER", 2, 350, 6.0F, 4.0F, 10);
    public static ToolMaterial MATERIAL_WEAKNESS = EnumHelper.addToolMaterial("MATERIAL_WEAKNESS", 2, 350, 6.0F, 4.0F, 10);
    
    // ESPADAS
    public static Item swordFire;
    public static Item swordIce;
    public static Item swordPoison;
    public static Item swordLightning;
    public static Item swordWither;
    public static Item swordNausea;
    public static Item swordHunger;
    public static Item swordWeakness;
    
    public static void registerItems() {
        // Espadas originais
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
        
        // Novas espadas
        swordLightning = new SwordLightning(MATERIAL_LIGHTNING)
            .setUnlocalizedName("swordLightning")
            .setTextureName("mymodid:swordLightning");
        GameRegistry.registerItem(swordLightning, "swordLightning");
        
        swordWither = new SwordWither(MATERIAL_WITHER)
            .setUnlocalizedName("swordWither")
            .setTextureName("mymodid:swordWither");
        GameRegistry.registerItem(swordWither, "swordWither");
        
        swordNausea = new SwordNausea(MATERIAL_NAUSEA)
            .setUnlocalizedName("swordNausea")
            .setTextureName("mymodid:swordNausea");
        GameRegistry.registerItem(swordNausea, "swordNausea");
        
        swordHunger = new SwordHunger(MATERIAL_HUNGER)
            .setUnlocalizedName("swordHunger")
            .setTextureName("mymodid:swordHunger");
        GameRegistry.registerItem(swordHunger, "swordHunger");
        
        swordWeakness = new SwordWeakness(MATERIAL_WEAKNESS)
            .setUnlocalizedName("swordWeakness")
            .setTextureName("mymodid:swordWeakness");
        GameRegistry.registerItem(swordWeakness, "swordWeakness");
    }
    
    public static void registerRecipes() {
        GameRegistry.addRecipe(new ItemStack(swordFire),
            " X ",
            " X ",
            " Y ",
            'X', Items.blaze_rod,
            'Y', Items.stick
        );
        
        GameRegistry.addRecipe(new ItemStack(swordIce),
            " X ",
            " X ",
            " Y ",
            'X', Blocks.ice,
            'Y', Items.stick
        );
    
        GameRegistry.addRecipe(new ItemStack(swordPoison),
            " X ",
            " X ",
            " Y ",
            'X', Items.spider_eye,
            'Y', Items.stick
        );
        
        GameRegistry.addRecipe(new ItemStack(swordLightning),
            " X ",
            " Y ",
            " Z ",
            'X', Items.iron_ingot,
            'Y', Items.gold_ingot,
            'Z', Items.stick
        );

        GameRegistry.addRecipe(new ItemStack(swordWither),
            " X ",
            " X ",
            " Y ",
            'X', Items.coal,
            'Y', Items.stick
        );
        
        GameRegistry.addRecipe(new ItemStack(swordNausea),
            " X ",
            " X ",
            " Y ",
            'X', Items.poisonous_potato,
            'Y', Items.stick
        );
        
        GameRegistry.addRecipe(new ItemStack(swordHunger),
            " X ",
            " X ",
            " Y ",
            'X', Items.rotten_flesh,
            'Y', Items.stick
        );
        
        GameRegistry.addRecipe(new ItemStack(swordWeakness),
            " X ",
            " X ",
            " Y ",
            'X', Items.bone,
            'Y', Items.stick
        );
    }
}