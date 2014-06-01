package me.onesrodriguez.empirepets;

import java.util.HashSet;
import java.util.Set;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PetShop {

    public static ItemStack mooCow = new ItemStack(Material.MONSTER_EGG, 1, (short) 92);
    public static ItemStack baaSheep = new ItemStack(Material.MONSTER_EGG, 1, (short) 91);
    public static ItemStack oinkPig = new ItemStack(Material.MONSTER_EGG, 1, (short) 90);
    public static ItemStack Stevie = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);    
    
    public static void openPetShop(Player player){
        Inventory inv = Bukkit.createInventory(null, 9, "§8[§6Pet§8] §ePet§lShop");
         
        ItemMeta cowMeta = mooCow.getItemMeta();
        cowMeta.setDisplayName("§cMoooo§lCow");
        mooCow.setItemMeta(cowMeta);

        ItemMeta sheepMeta = baaSheep.getItemMeta();
        sheepMeta.setDisplayName("§fBaaa§lSheep");
        baaSheep.setItemMeta(sheepMeta);

        ItemMeta pigMeta = oinkPig.getItemMeta();
        pigMeta.setDisplayName("§Oinky§lPig");
        oinkPig.setItemMeta(pigMeta);
        
        ItemMeta stevieMeta = Stevie.getItemMeta();
        stevieMeta.setDisplayName("§8Mr§lSteve");
        Stevie.setItemMeta(stevieMeta);

        inv.setItem(1, mooCow);
        inv.setItem(3, baaSheep);
        inv.setItem(5, oinkPig);
        inv.setItem(7, Stevie);

        player.openInventory(inv);
    }
    
    public static Set<String> cowOwners = new HashSet<String>();
    public static Set<String> sheepOwners = new HashSet<String>();
    public static Set<String> pigOwners = new HashSet<String>();
    public static Set<String> steveOwners = new HashSet<String>();
    
    public static boolean playerOwnsCow(Player player){
        return cowOwners.contains(player.getName());
    }
    
    public static boolean playerOwnsSheep(Player player){
        return sheepOwners.contains(player.getName());
    }
    
    public static boolean playerOwnsPig(Player player){
        return pigOwners.contains(player.getName());
    }
    
    public static boolean playerOwnsSteve(Player player){
        return steveOwners.contains(player.getName());
    }
    
}
