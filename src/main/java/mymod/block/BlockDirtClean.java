package mymod.block;

import mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDirtClean extends Block {

    public BlockDirtClean(){
        super(Material.ROCK);
        setUnlocalizedName(MyMod.MODID + ".cleanDirt");
        setRegistryName("cleanDirt");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

}
