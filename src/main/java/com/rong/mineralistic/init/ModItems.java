package com.rong.mineralistic.init;

import com.rong.mineralistic.items.ItemGravelFilter;
import com.rong.mineralistic.items.ItemTFActivator;
import com.rong.mineralistic.items.ItemWoodMesh;
import com.rong.mineralistic.items.tools.ItemFlintAxe;
import com.rong.mineralistic.items.tools.ItemFlintHoe;
import com.rong.mineralistic.items.tools.ItemFlintPickaxe;
import com.rong.mineralistic.items.tools.ItemFlintShovel;
import com.rong.mineralistic.items.tools.ItemFlintSword;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static Item flintPickaxe;
	public static Item flintAxe;
	public static Item flintShovel;
	public static Item flintHoe;
	public static Item flintSword;
	public static Item gravelFilter;
	public static Item woodMesh;
	public static Item activator;
	
	public static final String flint = "flint";

	public static ToolMaterial flintMaterial = EnumHelper.addToolMaterial("flintMaterial", 1, 120, 4.5F, 1.0F, 2);
	
	public static final void init() {
		
		flintPickaxe = new ItemFlintPickaxe(flintMaterial).setUnlocalizedName(flint + "_" + "pickaxe").setTextureName(flint + "_" + "pickaxe");
		flintAxe = new ItemFlintAxe(flintMaterial).setUnlocalizedName(flint + "_" + "axe").setTextureName(flint + "_" + "axe");
		flintShovel = new ItemFlintShovel(flintMaterial).setUnlocalizedName(flint + "_" + "shovel").setTextureName(flint + "_" + "shovel");
		flintHoe = new ItemFlintHoe(flintMaterial).setUnlocalizedName(flint + "_" + "hoe").setTextureName(flint + "_" + "hoe");
		flintSword = new ItemFlintSword(flintMaterial).setUnlocalizedName(flint + "_" + "sword").setTextureName(flint + "_" + "sword");
		
		gravelFilter = new ItemGravelFilter().setUnlocalizedName("gravel_filter").setTextureName("gravel_filter");
		woodMesh = new ItemWoodMesh().setUnlocalizedName("wood_mesh").setTextureName("wood_mesh");
		
		activator = new ItemTFActivator().setUnlocalizedName("tf_activator").setTextureName("tf_activator");
		
		GameRegistry.registerItem(flintPickaxe, flintPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flintAxe, flintAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flintShovel, flintShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flintHoe, flintHoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(flintSword, flintSword.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(gravelFilter, gravelFilter.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(woodMesh, woodMesh.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(activator, activator.getUnlocalizedName().substring(5));
		
	}
}
