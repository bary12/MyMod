package mymod;

import mymod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MyMod.MODID, version = MyMod.VERSION)
public class MyMod
{
    public static final String MODID = "mymod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "mymod.proxy.ClientProxy", serverSide = "mymod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MyMod instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
