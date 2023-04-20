package xyz.balbucio.free.party.spigot.Plugins;

public enum PluginsSimulados {
    LOSTPARTIES, MCOREPARTY
}
package xyz.balbucio.free.party.spigot.Plugins;

import de.simonsator.partyandfriends.spigot.api.pafplayers.PAFPlayer;
import de.simonsator.partyandfriends.spigot.api.pafplayers.PAFPlayerManager;
import de.simonsator.partyandfriends.spigot.api.party.PartyManager;
import de.simonsator.partyandfriends.spigot.api.party.PlayerParty;
import xyz.balbucio.free.party.spigot.PartyFake.PartyFake;

import java.util.ArrayList;
import java.util.List;

public enum PluginsType {
    BALBPARTY{
        @Override
        public PartyFake getParty(String name){
            return null;
        }
    }, PAF{
        @Override
        public PartyFake getParty(String name){
            PAFPlayer player = PAFPlayerManager.getInstance().getPlayer(name);
            PlayerParty party = PartyManager.getInstance().getParty(player);
            if(player != null || party != null) {
                ArrayList<String> listplayers = new ArrayList<>();
                for(PAFPlayer partyPlayer : party.getPlayers()){
                    listplayers.add(partyPlayer.getName());
                }
                PartyFake partyFake = new PartyFake(party.getLeader().getName(), listplayers);
                partyFake.setName(party.getLeader().getName() + " Party");
                partyFake.setSlots(party.getAllPlayers().size());
                return partyFake;
            }
            return null;
        }

    }, PARTIES{
        @Override
        public PartyFake getParty(String name){
            return null;
        }
    };

    public abstract PartyFake getParty(String name);
}
