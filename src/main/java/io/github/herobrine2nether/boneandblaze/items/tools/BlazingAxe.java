package io.github.herobrine2nether.boneandblaze.items.tools;

import io.github.herobrine2nether.boneandblaze.Constants;
import io.github.herobrine2nether.boneandblaze.materials.BBToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class BlazingAxe extends ItemAxe {
	public static String name = "blazing_axe";
	public BlazingAxe() {
		super(BBToolMaterial.toolMaterial);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName(Constants.MODID + "." + name);
		this.setMaxStackSize(1);
	}
}