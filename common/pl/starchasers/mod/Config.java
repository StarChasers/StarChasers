package pl.starchasers.mod;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config extends Configuration {
	public static Config instance = null;  
    public int witillitichestID;
    
    public Config(File file){
        
        super(file);
        instance = this;
        save();
    }
    
    public void load(){
        super.load();
        
        witillitichestID = getBlock("witillitichest", 1001).getInt();
        
    }
    
    public void save(){
        super.save();
    }
}
