package io.github.supersmashexperiments.ssc.event;

import org.bukkit.entity.Player;

public class DoubleJumpEvent extends SmashEvent {
  private Player player;

  public DoubleJumpEvent(Player player) {
    this.player = player;
  }

  public Player getPlayer() {
    return this.player;
  }
}
