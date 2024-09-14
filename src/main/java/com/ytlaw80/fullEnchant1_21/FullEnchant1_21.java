//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.ytlaw80.fullEnchant1_21;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FullEnchant1_21 extends JavaPlugin implements Listener {
    public void FullEnchant1_21() {
    }

    public void onEnable() {
        this.registerCommand("Helmet", new Helmet());
        this.registerCommand("Chestplate", new Chestplate());
        this.registerCommand("Leggings", new Leggings());
        this.registerCommand("Boots", new Boots());
        this.registerCommand("Sword", new Sword());
        this.registerCommand("Axe", new Axe());
        this.registerCommand("Shield", new Shield());
        this.registerCommand("Pickaxe", new Pickaxe());
        this.registerCommand("Shovel", new Shovel());
        this.registerCommand("Hoe", new Hoe());
        this.registerCommand("Shears", new Shears());
        this.registerCommand("FishingRod", new FishingRod());
        this.registerCommand("Bow", new Bow());
        this.registerCommand("Crossbow", new Crossbow());
        this.registerCommand("Trident", new Trident());
        this.registerCommand("Mace", new Mace());
    }

    private void registerCommand(String name, CommandExecutor executor) {
        if (this.getCommand(name) != null) {
            this.getCommand(name).setExecutor(executor);
        } else {
            this.getLogger().warning("Command '" + name + "' is not registered in plugin.yml");
        }

    }

    public void onDisable() {
    }
}

// commit test