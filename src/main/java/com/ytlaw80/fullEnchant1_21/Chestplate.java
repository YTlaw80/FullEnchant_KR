package com.ytlaw80.fullEnchant1_21;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class Chestplate implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, @NotNull Command command, String s, String[] args) {
        sender.sendMessage(ChatColor.AQUA+"흉갑의 최대 마법부여 + 마법부여대 사용 가능 여부:");
        sender.sendMessage(ChatColor.GOLD+"보호 Protection   4(IV) "+ ChatColor.GREEN+"  (O)");
        sender.sendMessage(ChatColor.GOLD+"내구성 Unbreaking   3(III) "+ ChatColor.GREEN+"  (O)");
        sender.sendMessage(ChatColor.GOLD+"수선 Mending   1(I) "+ ChatColor.RED+"  (X)\n");
        sender.sendMessage(ChatColor.AQUA+"\n추가 마법부여 + 마법부여대 사용가능 여부: ");
        sender.sendMessage(ChatColor.GOLD+"가시 Thorns   3(III) "+ ChatColor.GREEN+"  (O)");
        sender.sendMessage(ChatColor.GOLD+"귀속 저주 Curse of binding   1(I) "+ ChatColor.RED+"  (X)");
        sender.sendMessage(ChatColor.GOLD+"소실 저주 Curse of vanishing   1(I) "+ ChatColor.RED+"  (X)\n");
        return true;
    }
}
