package me.onesrodriguez.empirepets;

import me.onesrodriguez.empirepets.commands.EmpirePet;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin{

    public static void sendMessage(Player player, String message){
        player.sendMessage(CHAT_TAG + message);
    }
    
    public static String CHAT_TAG = "§8[§5TheEmpire§8] ";
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
