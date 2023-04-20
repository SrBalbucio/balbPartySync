package xyz.balbucio.free.party.spigot.PartyFake;

import de.simonsator.partyandfriends.spigot.api.pafplayers.PAFPlayer;
import xyz.balbucio.free.party.spigot.Plugins.PluginsType;

import java.util.package xyz.balbucio.free.party.spigot.PartyFake;

import de.simonsator.partyandfriends.spigot.api.pafplayers.PAFPlayer;
import xyz.balbucio.free.party.spigot.Plugins.PluginsType;

import java.util.ArrayList;
import java.util.List;

public class PartyFake {

    private String name;
    private String owner;
    private List<String> members;
    private int slots;
    private boolean allow;
    private PluginsType pluginsType;

    public PartyFake(String owner, List<String> members) {
        this.owner = owner;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public int getSlots() {
        return slots;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public boolean isAllow() {
        return allow;
    }

    public void setAllow(boolean allow) {
        this.allow = allow;
    }

    public PluginsType getPluginsType() {
        return pluginsType;
    }

    public void setPluginsType(PluginsType pluginsType) {
        this.pluginsType = pluginsType;
    }
}
