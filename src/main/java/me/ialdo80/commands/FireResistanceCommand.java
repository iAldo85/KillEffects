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

public class FireResistanceCommand extends BaseCommand {

    private final FileConfig settingsConfig = Kill.get().getSettingsConfig();

    @Command(name = "fireresistance", permission = "command.fireresistance", inGameOnly = true)
    @Override
    public void onCommand(CommandArgs command) {

        Player player = command.getPlayer();

        if (settingsConfig.getBoolean("FIRERESISTANCE-COMMAND.ENABLED")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 20 * settingsConfig.getInt("FIRERESISTANCE-COMMAND.TIME"), settingsConfig.getInt("FIRERESISTANCE-COMMAND.LEVEL")));
            ChatUtil.message(player, settingsConfig.getString("FIRERESISTANCE-COMMAND.MESSAGE"));
        }

    }
}
