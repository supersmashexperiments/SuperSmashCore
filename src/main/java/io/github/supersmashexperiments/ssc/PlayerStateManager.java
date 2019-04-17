package io.github.supersmashexperiments.ssc;

import java.util.HashMap;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerStateManager {
  private static final HashMap<Player, PlayerState> playerStates = new HashMap<>();

  public static void save(Player player) {
    PlayerState playerState = new PlayerState();
    playerState.allowFlight = player.getAllowFlight();
    playerState.gameMode = player.getGameMode();
    playerState.inventoryContents = player.getInventory().getContents();
    playerState.level = player.getLevel();
    playerState.exp = player.getExp();

    playerStates.put(player, playerState);
  }

  public static void restore(Player player) {
    PlayerState playerState = playerStates.get(player);

    if (playerState == null) return;

    player.setAllowFlight(playerState.allowFlight);
    player.setGameMode(playerState.gameMode);
    player.getInventory().setContents(playerState.inventoryContents);
    player.setLevel(playerState.level);
    player.setExp(playerState.exp);

    playerStates.remove(player);
  }

  private static class PlayerState {
    Boolean allowFlight;
    GameMode gameMode;
    ItemStack[] inventoryContents;
    int level;
    float exp;
  }
}
