package io.github.supersmashexperiments.ssc;

import org.bukkit.entity.Player;

import io.github.supersmashexperiments.ssc.event.SmashEventHandler;
import io.github.supersmashexperiments.ssc.kit.*;

public class Controller {
  private static final EventRegistrar events = new EventRegistrar();
  private final Plugin plugin;

  Controller(Plugin plugin) {
    this.plugin = plugin;

    plugin.getServer().getPluginManager().registerEvents(events, plugin);
  }

  public static void equip(Player player, SuperSmashKit kit) {
    for (Ability ability : kit.getAbilities()) {
      SmashEventHandler[] eventHandlers = ability.getEventHandlers();

      for (int i = 0; i < eventHandlers.length; i++) {
        events.registerEventHandler(eventHandlers[i]);
      }
    }
  }
}
