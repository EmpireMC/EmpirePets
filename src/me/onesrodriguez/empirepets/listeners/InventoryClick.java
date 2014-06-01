package me.onesrodriguez.empirepets.listeners;

import me.onesrodriguez.empirepets.PetShop;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClick implements Listener{

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        if(!event.getInventory().getName().equalsIgnoreCase("§8[§6Pet§8] §ePet§lShop") | !event.getInventory().getName().equalsIgnoreCase("§8[§6Pet§8] §ePet §lChooser")){
            return;
        }
        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);
        
        if(event.getCurrentItem() == null || event.getCurrentItem().getType() == Material.AIR || !event.getCurrentItem().hasItemMeta()){
            player.closeInventory();
            return;
        }
        
        if(event.getCurrentItem() == PetShop.mooCow){
            
        }
        
        if(event.getCurrentItem() == PetShop.baaSheep){
            
        }
        
        if(event.getCurrentItem() == PetShop.oinkPig){
            
        }
        
        if(event.getCurrentItem() == PetShop.Stevie){
            
        }
    }
}
