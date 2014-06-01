package me.onesrodriguez.empirepets;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PetGUI {
    
    public static ItemStack mooCow = new ItemStack(Material.MONSTER_EGG, 1, (short) 92);
    public static ItemStack baaSheep = new ItemStack(Material.MONSTER_EGG, 1, (short) 91);
    public static ItemStack oinkPig = new ItemStack(Material.MONSTER_EGG, 1, (short) 90);
    public static ItemStack Stevie = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
    public static ItemStack noPets = new ItemStack(Material.MONSTER_EGG, 1);    
    
    public static void openPetGUI(Player player){
        Inventory inv = Bukkit.createInventory(null, 9, "§8[§6Pet§8] §ePet §lChooser");
        
        ItemMeta cowMeta = mooCow.getItemMeta();
        cowMeta.setDisplayName("§cMoooo§lCow");
        mooCow.setItemMeta(cowMeta);

        ItemMeta sheepMeta = baaSheep.getItemMeta();
        sheepMeta.setDisplayName("§fBaaa§lSheep");
        baaSheep.setItemMeta(sheepMeta);
        
        ItemMeta pigMeta = oinkPig.getItemMeta();
        pigMeta.setDisplayName("§dOink§lPig");
        oinkPig.setItemMeta(pigMeta);
        
        ItemMeta stevieMeta = Stevie.getItemMeta();
        stevieMeta.setDisplayName("§aMr§lSteve");
        Stevie.setItemMeta(stevieMeta);
        
        ItemMeta noPetsMeta = Stevie.getItemMeta();
        noPetsMeta.setDisplayName("§8No pets ;(");
        Stevie.setItemMeta(noPetsMeta);

        if(PetShop.playerOwnsCow(player) == true)
           inv.setItem(1, mooCow);
        if(PetShop.playerOwnsSheep(player) == true)
           inv.setItem(3, baaSheep);
        if(PetShop.playerOwnsPig(player) == true)
           inv.setItem(5, oinkPig);
        if(PetShop.playerOwnsSteve(player) == true)
           inv.setItem(7, Stevie);
        if(PetShop.playerOwnsCow(player) == false | PetShop.playerOwnsSheep(player) == false | PetShop.playerOwnsPig(player) == false | PetShop.playerOwnsSteve(player) == false){
           inv.setItem(0, noPets);
        }
    }
}

