package com.discord.alde.proxy;

import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerItemRenderer(Item item, int meta) {
		// TODO Auto-generated method stub
		super.registerItemRenderer(item, meta);
	}
	
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {
		// TODO Auto-generated method stub
		super.registerVariantRenderer(item, meta, filename, id);
	}
	
	@Override
	public void registerEntityRenderers() {
		// TODO Auto-generated method stub
		super.registerEntityRenderers();
	}
	
	@Override
	public void preInit() {
		// TODO Auto-generated method stub
		super.preInit();
	}

}
