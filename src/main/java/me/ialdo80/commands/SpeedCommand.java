package me.ialdo80.commands;

import me.ialdo80.Kill;
import me.ialdo80.utils.chat.ChatUtil;
import me.ialdo80.utils.command.BaseCommand;
import me.ialdo80.utils.command.Command;
import me.ialdo80.utils.command.CommandArgs;
import me.ialdo80.utils.file.FileConfig;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpeedCommand extends BaseCommand {

    private final FileConfig settingsConfig = Kill.get().getSettingsConfig();

    @Command(name = "speed", permission = "command.speed", inGameOnly = true)
    @Override
    public void onCommand(CommandArgs command) {

        Player player = command.getPlayer();

        if (settingsConfig.getBoolean("SPEED-COMMAND.ENABLED")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * settingsConfig.getInt("SPEED-COMMAND.TIME"), settingsConfig.getInt("SPEED-COMMAND.LEVEL")));
            ChatUtil.message(player, settingsConfig.getString("SPEED-COMMAND.MESSAGE"));
        }
    }
}