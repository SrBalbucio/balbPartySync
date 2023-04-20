package xyz.balbucio.free.party.spigot.Commands;

public class PartySyncCommand {
}
package xyz.balbucio.free.party.spigot;

import xyz.balbucio.free.party.spigot.Plugins.PluginsType;

public class Config {

    public static PluginsType onePlugin;

    public static PluginsType getOnePlugin() {
        return onePlugin;
    }

    public static void setOnePlugin(PluginsType onePlugin) {
        Config.onePlugin = onePlugin;
    }
}
