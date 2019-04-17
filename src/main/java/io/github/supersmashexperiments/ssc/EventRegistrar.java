package io.github.supersmashexperiments.ssc;

import java.util.HashMap;
import java.util.LinkedHashSet;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;

import io.github.supersmashexperiments.ssc.event.*;

public class EventRegistrar implements Listener {
  private final HashMap<Class<? extends SmashEvent>, LinkedHashSet<SmashEventExecutor>> handlers;

  public EventRegistrar() {
    this.handlers = new HashMap<>();
  }

  public void registerEventHandler(SmashEventHandler eventHandler) {
    Class<? extends SmashEvent> eventClass = eventHandler.getEventClass();
    SmashEventExecutor executor = eventHandler.getExecutor();

    LinkedHashSet<SmashEventExecutor> executorList = handlers.get(eventClass);

    if (executorList == null) {
      executorList = new LinkedHashSet<>();
      executorList.add(executor);

      handlers.put(eventClass, executorList);
    } else {
      executorList.add(executor);
    }
  }
}
