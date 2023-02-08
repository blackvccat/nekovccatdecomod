package io.github.blackvccat.vcgun_mod;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;



import java.util.List;


@Mod("vcgun_mod")
@Mod.EventBusSubscriber
public class Main {
    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event){
        Player player = event.getEntity();
        Level level = player.level;

        player.sendSystemMessage(Component.nullToEmpty("a mod for WWI GUN"+player.getDisplayName().getString()+(level.isClientSide()?"CLIENT":"SERVER")));



    }

}