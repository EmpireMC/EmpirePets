package me.onesrodriguez.empirepets;

import me.onesrodriguez.empirepets.commands.EmpirePet;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{

    @Override
    public void onEnable() {
        System.out.println("EMPIREPETS DISABLED!!!!");
        getCommand("empirepet").setExecutor(new EmpirePet(this));
    }
    
    @Override
    public void onDisable() {
        System.out.println("EMPIREPETS ENABLED!!!!");
    }
}
