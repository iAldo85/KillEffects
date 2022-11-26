package me.ialdo80;

import lombok.Getter;
import lombok.Setter;
import me.ialdo80.commands.FireResistanceCommand;
import me.ialdo80.commands.SpeedCommand;
import me.ialdo80.events.KillEvent;
import me.ialdo80.utils.chat.ChatUtil;
import me.ialdo80.utils.command.CommandManager;
import me.ialdo80.utils.file.FileConfig;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

@Getter @Setter
public final class Kill extends JavaPlugin {

    public static Plugin plugin;
    private CommandManager commandManager;
    private FileConfig settingsConfig;

    @Override
    public void onEnable() {
        this.settingsConfig = new FileConfig(this, "settings.yml");
        ChatUtil.log("&7&m-----------------------------");
        ChatUtil.log("&b&lKillEffects");
        ChatUtil.log("");
        ChatUtil.log("&bVersion: &a" + this.getDescription().getVersion());
        ChatUtil.log("&bAuthor: &a" + this.getDescription().getAuthors().get(0));
        ChatUtil.log("&7&m-----------------------------");

        this.loadEvents();

        this.commandManager = new CommandManager(this, new ArrayList<>());
        this.registerCommand();
    }

    @Override
    public void onDisable() {
        ChatUtil.log("&c&lKillEffects has been disabled!");
    }

    public void registerCommand() {
        new SpeedCommand();
        new FireResistanceCommand();
    }

    public void loadEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new KillEvent(), this);
    }

    public static Kill get() { return getPlugin(Kill.class); }
}
