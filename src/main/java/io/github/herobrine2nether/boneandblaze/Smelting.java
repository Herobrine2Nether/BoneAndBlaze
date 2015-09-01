package io.github.herobrine2nether.boneandblaze;

import java.util.Random;

import io.github.herobrine2nether.boneandblaze.blocks.BlockManager;
import io.github.herobrine2nether.boneandblaze.items.ItemManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Smelting {
	public static void smeltAll() {
		smeltBlocks();
	}
	
	public static void smeltBlocks() {
		Random random = new Random();
		GameRegistry.addSmelting(new ItemStack(BlockManager.blazeOre),
				new ItemStack(Items.blaze_powder, 2 + random.nextInt(1)), 0.1f);
		GameRegistry.addSmelting(new ItemStack(Items.blaze_powder),
				new ItemStack(ItemManager.blazeIngot, 1), 0.3f);
	}
}
