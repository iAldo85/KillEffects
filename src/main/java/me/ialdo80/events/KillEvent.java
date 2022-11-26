package me.ialdo80.events;

import me.ialdo80.Kill;
import me.ialdo80.utils.chat.ChatUtil;
import me.ialdo80.utils.file.FileConfig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class KillEvent implements Listener {

    private final FileConfig settingsConfig = Kill.get().getSettingsConfig();

    @EventHandler
    public void onKillEvent(PlayerDeathEvent event) {
        Player killer = event.getEntity().getKiller();

        if (!(event.getEntity().getKiller() == null)) {
            if (settingsConfig.getBoolean("SPEED-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20 * settingsConfig.getInt("SPEED-EFFECT.TIME"), settingsConfig.getInt("SPEED-EFFECT.LEVEL")));
                ChatUtil.message(killer, settingsConfig.getString("SPEED-EFFECT.MESSAGE"));
            }
            if (settingsConfig.getBoolean("RESISTANCE-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 20 * settingsConfig.getInt("RESISTANCE-EFFECT.TIME"), settingsConfig.getInt("RESISTANCE-EFFECT.LEVEL")));
                ChatUtil.message(killer, settingsConfig.getString("RESISTANCE-EFFECT.MESSAGE"));
            }

            if (settingsConfig.getBoolean("NIGHT-VISION-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 20 * settingsConfig.getInt("NIGHT-VISION-EFFECT.TIME"), settingsConfig.getInt("NIGHT-VISION-EFFECT.LEVEL")));
                ChatUtil.message(killer, settingsConfig.getString("NIGHT-VISION.MESSAGE"));
            }

            if (settingsConfig.getBoolean("FIRE-RESISTANCE-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 20 * settingsConfig.getInt("FIRE-RESISTANCE-EFFECT.TIME"), settingsConfig.getInt("FIRE-RESISTANCE-EFFECT.LEVEL")));
                ChatUtil.message(killer, settingsConfig.getString("FIRE-RESISTANCE-EFFECT.MESSAGE"));
            }

            if (settingsConfig.getBoolean("ABSORPTION-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 20 * settingsConfig.getInt("ABSORPTION-EFFECT.TIME"), settingsConfig.getInt("ABSORPTION-EFFECT.LEVEL")));
                ChatUtil.message(killer, settingsConfig.getString("ABSORPTION-EFFECT.MESSAGE"));
            }
            if (settingsConfig.getBoolean("BLINDNESS-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * settingsConfig.getInt("BLINDNESS-EFFECT.TIME"), settingsConfig.getInt("BLINDNESS-EFFECT.LEVEL")));
                ChatUtil.message(killer, settingsConfig.getString("BLINDNESS-EFFECT.MESSAGE"));
            }
            if (settingsConfig.getBoolean("CONFUSION-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 20 * settingsConfig.getInt("CONFUSION-EFFECT.TIME"), settingsConfig.getInt("CONFUSION-EFFECT.LEVEL")));
                ChatUtil.message(killer, settingsConfig.getString("CONFUSION-EFFECT.MESSAGE"));
            }
            if (settingsConfig.getBoolean("FAST-DIGGING-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 20 * settingsConfig.getInt("FAST-DIGGING-EFFECT.TIME"), settingsConfig.getInt("FAST-DIGGING-EFFECT.LEVEL")));
                ChatUtil.message(killer, settingsConfig.getString("FAST-DIGGING-EFFECT.MESSAGE"));
            }
            if (settingsConfig.getBoolean("GLOWING-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 20 * settingsConfig.getInt("GLOWING-EFFECT.TIME"), settingsConfig.getInt("GLOWING-EFFECT.LEVEL")));
                ChatUtil.message(killer, "GLOWING-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("HEAL-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 20 * settingsConfig.getInt("HEAL-EFFECT.TIME"), settingsConfig.getInt("HEAL-EFFECT.LEVEL")));
                ChatUtil.message(killer, "HEAL-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("HEALTH-BOOST.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, settingsConfig.getInt("HEALTH-BOOST.TIME"), settingsConfig.getInt("HEALTH-BOOST.LEVEL")));
                ChatUtil.message(killer, "HEALTH-BOOST.MESSAGE");
            }
            if (settingsConfig.getBoolean("HUNGER-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 20 * settingsConfig.getInt("HUNGER-EFFECT.TIME"), settingsConfig.getInt("HUNGER-EFFECT.LEVEL")));
                ChatUtil.message(killer, "HUNGER-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("INCREASE-DMG.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * settingsConfig.getInt("INCREASE-DMG.TIME"), settingsConfig.getInt("INCREESE-DMG.LEVEL")));
                ChatUtil.message(killer, "INCREASE-DMG.MESSAGE");
            }
            if (settingsConfig.getBoolean("INVISIBILITY-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20 * settingsConfig.getInt("INVISIBILITY-EFFECT.TIME"), settingsConfig.getInt("INVISIBILITY-EFFECT.LEVEL")));
                ChatUtil.message(killer, "INVISIBILITY-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("JUMP-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20 * settingsConfig.getInt("JUMP-EFFECT.TIME"), settingsConfig.getInt("JUMP-EFFECT.LEVEL")));
                ChatUtil.message(killer, "JUMP-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("LEVITATION-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 20 * settingsConfig.getInt("LEVITATION-EFFECT.TIME"), settingsConfig.getInt("LEVIATION-EFFECT.LEVEL")));
                ChatUtil.message(killer, "LEVITATION-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("LUCK-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 20 * settingsConfig.getInt("LUCK-EFFECT.TIME"), settingsConfig.getInt("LUCK-EFFECT.LEVEL")));
                ChatUtil.message(killer, "LUCK-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("POISON-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 * settingsConfig.getInt("POISON-EFFECT.TIME"), settingsConfig.getInt("POISON-EFFECT.LEVEL")));
                ChatUtil.message(killer, "POISON-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("REGENERATION-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * settingsConfig.getInt("REGENERATION-EFFECT.TIME"), settingsConfig.getInt("REGENERATION-EFFECT.LEVEL")));
                ChatUtil.message(killer, "REGENERATION-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("SATURATION-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 20 * settingsConfig.getInt("SATURATION-EFFECT.TIME"), settingsConfig.getInt("SATURATION-EFFECT.LEVEL")));
                ChatUtil.message(killer, "SATURATION-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("SLOW-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20 * settingsConfig.getInt("SLOW-EFFECT.TIME"), settingsConfig.getInt("SLOW-EFFECT.LEVEL")));
                ChatUtil.message(killer, "SLOW-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("SLOW-DIGGING-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 20 * settingsConfig.getInt("SLOW-DIGGING-EFFECT.TIME"), settingsConfig.getInt("SLOW-DIGGING-EFFECT.LEVEL")));
                ChatUtil.message(killer, "SLOW-DIGGING-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("UNLUCK-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 20 * settingsConfig.getInt("UNLUCK-EFFECT.TIME"), settingsConfig.getInt("UNLUCK-EFFECT.LEVEL")));
                ChatUtil.message(killer, "UNLUCK-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("WATER-BREATHING.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 20 * settingsConfig.getInt("WATER-BREATHING.TIME"), settingsConfig.getInt("WATER-BREATHING.LEVEL")));
                ChatUtil.message(killer, "WATER-BREATHING.MESSAGE");
            }
            if (settingsConfig.getBoolean("WEAKNESS-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 20 * settingsConfig.getInt("WEAKNESS-EFFECT.TIME"), settingsConfig.getInt("WEAKNESS-EFFECT.LEVEL")));
                ChatUtil.message(killer, "WEAKNESS-EFFECT.MESSAGE");
            }
            if (settingsConfig.getBoolean("WITHER-EFFECT.ENABLED")) {
                killer.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20 * settingsConfig.getInt("WITHER-EFFECT.TIME"), settingsConfig.getInt("WITHER-EFFECT.LEVEL")));
                ChatUtil.message(killer, "WITHER-EFFECT.MESSAGE");
            }
        }
    }
}