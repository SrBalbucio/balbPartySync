package xyz.balbucio.free.party.spigot.Files;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import xyz.balbucio.free.party.spigot.Config;
import xyz.balbucio.free.party.spigot.Plugins.PluginsType;
import xyz.balbucio.free.party.spigot.Utils.balbLogger;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.logging.Level;

publicpackage xyz.balbucio.free.party.spigot.Files;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import xyz.balbucio.free.party.spigot.Config;
import xyz.balbucio.free.party.spigot.Plugins.PluginsType;
import xyz.balbucio.free.party.spigot.Utils.balbLogger;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.logging.Level;

public class FileManager {
    public static void loadConfig(Plugin plg) {
        File folder = new File("plugins/balbPartySync");
        if (!folder.exists()) {
            folder.mkdir();
        }
        File file = new File("plugins/balbPartySync", "config.yml");
        if (!file.exists()) {
            try (InputStream in = plg.getResource("config.yml")) {
                Files.copy(in, file.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        file = new File("plugins/balbPartySync", "lang.yml");
        if (!file.exists()) {
            try (InputStream in = plg.getResource("lang.yml")) {
                Files.copy(in, file.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Config.setOnePlugin(PluginsType.valueOf(returnConfig().getString("partyplugin")));
        } catch (Exception e) {
            balbLogger.sendError("Não foi possível identificar o Plugin Principal. Por favor corriga a configuraçãO!");
            Bukkit.getLogger().log(Level.SEVERE, "[balbPartySync] Servidor será desligado!");
            Bukkit.shutdown();
        }
    }
    public static YamlConfiguration returnLang(){
        File file = new File("plugins/balbPartySync", "lang.yml");
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        return config;
    }
    public static YamlConfiguration returnConfig(){
        File file = new File("plugins/balbPartySync", "config.yml");
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        return config;
    }
}
