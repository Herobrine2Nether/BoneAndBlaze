package io.github.herobrine2nether.boneandblaze.oreGen;

import io.github.herobrine2nether.boneandblaze.blocks.BlockManager;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenHellLava;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class BlazeOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimensionId()){
        case -1:
        	// Dim -1 Nether
        	generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
            break;
        case 0:
            // Dim 0 Overworld
            break;
        case 1:
            // Dim 1 End
            break;
		}
	}
	
	public void generateNether(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		for (int i = 0; i < 15; i++) {
			int startX = chunkX * 16 + random.nextInt(16);
			int startY = random.nextInt(100) + 8;
			int startZ = chunkZ * 16 + random.nextInt(16);
			BlockPos start = new BlockPos(startX, startY, startZ);
			new WorldGenMinable(BlockManager.blazeOre.getDefaultState(), random.nextInt(2) + 3, BlockHelper.forBlock(Blocks.netherrack)).generate(world, random, start);
		}
	}

}
