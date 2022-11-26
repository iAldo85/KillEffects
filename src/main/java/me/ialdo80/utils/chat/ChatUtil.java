package me.ialdo80.utils.chat;

import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class ChatUtil {

    public static String translate(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    public List<String> translate(List<String> list) {
        return list.stream().map(ChatUtil::translate).collect(Collectors.toList());
    }
    public void log(String text) {
        Bukkit.getConsoleSender().sendMessage(translate(text));
    }
    public void message(Player player, String text) {
        player.sendMessage(translate(text));
    }
}
