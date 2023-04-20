package xyz.balbucio.free.party.spigot.Utils;

import org.bukkit.Bukkit;

public class balbLogger {
    private static String prefix = "§a[balbTheBridge]";
    public static void sendInfo(String msg){
        Bukkit.getConsoleSender().sendMessage(prefix+" §f[INFO] "+msg);
    }
    public static void sendError(String msg){
        Bukkit.getConsoleSender().sendMessage(prefix+" §4[ERROR] §c"+msg);
    }
    public static vopackage xyz.balbucio.free.party.spigot.Utils;

import org.bukkit.Bukkit;

public class balbLogger {
    private static String prefix = "§a[balbTheBridge]";
    public static void sendInfo(String msg){
        Bukkit.getConsoleSender().sendMessage(prefix+" §f[INFO] "+msg);
    }
    public static void sendError(String msg){
        Bukkit.getConsoleSender().sendMessage(prefix+" §4[ERROR] §c"+msg);
    }
    public static void sendLoadLog(String msg){
        Bukkit.getConsoleSender().sendMessage(prefix+" §f[LOAD] "+msg);
    }
    public static void sendStopLog(String msg){
        Bukkit.getConsoleSender().sendMessage(prefix+" §c[STOP] §f"+msg);
    }
}
