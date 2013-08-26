package pl.starchasers.mod;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import pl.starchasers.mod.crystals.CrystalProxy;


public class CommonProxy extends Proxy{

	
	
	@Override
	public void preInit() {
		CrystalProxy.preInit();
	}

	@Override
	public void load() {
		CrystalProxy.load();
	}

	@Override
	public void postInit() {
		CrystalProxy.postInit();
	}
	
}
