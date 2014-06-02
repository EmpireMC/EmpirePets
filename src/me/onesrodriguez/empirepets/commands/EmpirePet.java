package me.onesrodriguez.empirepets.commands;

import me.onesrodriguez.empirepets.Core;
import me.onesrodriguez.empirepets.PetGUI;
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
            PetGUI.openPetGUI(player);
        }
        if(player.hasPermission("empirepet.saxon")){
            PetGUI.openPetGUI(player);
        }
        if(player.hasPermission("empirepet.bowman")){
            PetGUI.openPetGUI(player);
        }
        if(player.hasPermission("empirepet.zeus")){
            PetGUI.openPetGUI(player);
        }
        if(player.hasPermission("empirepet.mod")){
            PetGUI.openPetGUI(player);
        }
        if(player.hasPermission("empirepet.snrmod")){
            PetGUI.openPetGUI(player);
        }
        if(player.hasPermission("empirepet.vip")){
            PetGUI.openPetGUI(player);
        }
        if(player.hasPermission("empirepet.headadmin")){
            PetGUI.openPetGUI(player);
        }
        if(player.hasPermission("empirepet.owner")){
            PetGUI.openPetGUI(player);
        }
        return true;
    }

}
