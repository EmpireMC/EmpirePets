package me.onesrodriguez.empirepets.commands;

import me.onesrodriguez.empirepets.Core;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EmpirePet implements CommandExecutor{
    
    public Core plugin;
 
    public EmpirePet(Core plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if(sender instanceof Player){
            sender.sendMessage("§4NOOOOOOOOPPPPPPPPPPPPEEEEEEEEEEE.");
        }
        Player player = (Player) sender;
        if(player.hasPermission("empirepet.member")){
            
        }
        if(player.hasPermission("empirepet.saxon")){
            
        }
        if(player.hasPermission("empirepet.bowman")){
            
        }
        if(player.hasPermission("empirepet.zeus")){
            
        }
        if(player.hasPermission("empirepet.mod")){
            
        }
        if(player.hasPermission("empirepet.snrmod")){
            
        }
        if(player.hasPermission("empirepet.vip")){
            
        }
        if(player.hasPermission("empirepet.headadmin")){
            
        }
        if(player.hasPermission("empirepet.owner")){
            
        }
        return true;
    }

}
