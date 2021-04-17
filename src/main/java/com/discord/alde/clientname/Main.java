package com.discord.alde.clientname;

import org.apache.logging.log4j.core.Logger;

import com.discord.alde.proxy.CommonProxy;
import com.discord.alde.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;
	
	public static org.apache.logging.log4j.Logger logger;
	
	@EventHandler
	private static void preInit(FMLPreInitializationEvent e) {

		logger = e.getModLog();
		
		proxy.preInit();
		
	}
	
	public static final DiscordRP discordRP = new DiscordRP();
	
	@EventHandler
	private static void Init(FMLInitializationEvent e) {
		
		discordRP.start();

	}
	
	public DiscordRP getDiscordRP() {
		return discordRP;
	}
	
	public void shutdown() {
		discordRP.shutdown();
	}
	
	@EventHandler
	private static void postInit(FMLPostInitializationEvent e) {


	}
}
