
package amongusminecraftblock.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import amongusminecraftblock.creativetab.TabBlocksmirahq;

import amongusminecraftblock.ElementsAmongusminecraftblockMod;

@ElementsAmongusminecraftblockMod.ModElement.Tag
public class BlockGroundmiraHQ6 extends ElementsAmongusminecraftblockMod.ModElement {
	@GameRegistry.ObjectHolder("amongusminecraftblock:groundmira_hq_6")
	public static final Block block = null;
	public BlockGroundmiraHQ6(ElementsAmongusminecraftblockMod instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("groundmira_hq_6"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("amongusminecraftblock:groundmira_hq_6", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("groundmira_hq_6");
			setSoundType(SoundType.STONE);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabBlocksmirahq.tab);
		}
	}
}