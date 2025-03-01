package me.eplugins.eglow.api;

import me.eplugins.eglow.api.enums.EGlowEffect;
import me.eplugins.eglow.api.enums.EGlowBlink;
import me.eplugins.eglow.api.enums.EGlowColor;
import me.eplugins.eglow.data.EGlowPlayer;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public class EGlowAPI {
	/**
	 * Get the IEGlowEntity from eGlow
	 *
	 * @param player player to get the IEGlowPlayer for
	 * @return IEGlowEntity instance for the player
	 */
	public EGlowPlayer getEGlowPlayer(Player player) {
		return new EGlowPlayer();
	}

	/**
	 * Get the IEGlowEntity from eGlow
	 *
	 * @param uuid uuid to get the IEGlowPlayer for
	 * @return IEGlowEntity instance for the uuid or null if player wasn't found
	 */
	public EGlowPlayer getEGlowPlayer(UUID uuid) {
		return new EGlowPlayer();
	}

	/**
	 * Get the IEGlowEffect from eGlow
	 *
	 * @param name name for the effect
	 * @return IEGlowEffect is found, null if not
	 */
	public me.eplugins.eglow.data.EGlowEffect getEGlowEffect(String name) {
		return new me.eplugins.eglow.data.EGlowEffect();
	}

	/**
	 * Get the glow color from a player
	 *
	 * @param eGlowPlayer player to get the glow color from
	 * @return Glow color as String (invisible)
	 */
	public String getGlowColor(EGlowPlayer eGlowPlayer) {
		return "";
	}

	/**
	 * Enable a specific effect for a player
	 *
	 * @param eGlowPlayer to activate the effect for
	 * @param eGlowEffect to enable
	 */
	public void enableGlow(EGlowPlayer eGlowPlayer, me.eplugins.eglow.data.EGlowEffect eGlowEffect) {}

	/**
	 * Enable a solid glow color for a player
	 *
	 * @param eGlowPlayer to activate the glow for
	 * @param color       to enable
	 */
	public void enableGlow(EGlowPlayer eGlowPlayer, EGlowColor color) {}

	/**
	 * Enable a blink effect for a player
	 *
	 * @param eGlowPlayer to activate the blink for
	 * @param blink       to enable
	 */
	public void enableGlow(EGlowPlayer eGlowPlayer, EGlowBlink blink) {}

	/**
	 * Enable an effect for a player
	 *
	 * @param eGlowPlayer to activate the effect for
	 * @param effect      to enable
	 */
	public void enableGlow(EGlowPlayer eGlowPlayer, EGlowEffect effect) {}

	/**
	 * Disable the glow for a player
	 *
	 * @param eGlowPlayer to disable the glow for
	 */
	public void disableGlow(EGlowPlayer eGlowPlayer) {}

	/**
	 * add custom receiver for a player
	 *
	 * @param eGlowPlayerSender player to add the custom receiver for
	 * @param playerReceiver    player that the sender will be able to see glowing
	 */
	public void addCustomGlowReceiver(EGlowPlayer eGlowPlayerSender, Player playerReceiver) {}

	/**
	 * remove custom receiver for a player
	 *
	 * @param eGlowPlayerSender player to remove the custom receiver for
	 * @param playerReceiver    player that the sender will no longer be able to see glowing
	 */
	public void removeCustomGlowReceiver(EGlowPlayer eGlowPlayerSender, Player playerReceiver) {}

	/**
	 * set custom receivers for a player
	 *
	 * @param eGlowPlayerSender  player to set the custom receivers for
	 * @param playerReceiverList players that the sender will be able to see glowing
	 */
	public void setCustomGlowReceivers(EGlowPlayer eGlowPlayerSender, List<Player> playerReceiverList) {}

	/**
	 * reset custom receivers for a player
	 *
	 * @param eGlowPlayer player to reset the custom receivers for
	 */
	public void resetCustomGlowReceivers(EGlowPlayer eGlowPlayer) {}

	/**
	 * Enable/Disable eGlow from sending team packets
	 *
	 * @param status true to send packets, false for nothing
	 */
	public void setSendTeamPackets(boolean status) {}

	/**
	 * Enable/Disable eGlow from blocking packets that could overwrite the glow color
	 *
	 * @param status true for packet blocking, false for nothing
	 */
	public void setPacketBlockerStatus(boolean status) {}
}