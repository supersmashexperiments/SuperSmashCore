package io.github.supersmashexperiments.ssc;

import java.util.HashMap;
import java.util.LinkedHashSet;

import org.bukkit.entity.Player;
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

  public void unregisterEventHandler(SmashEventHandler eventHandler) {
    Class<? extends SmashEvent> eventClass = eventHandler.getEventClass();

    LinkedHashSet<SmashEventExecutor> executorList = handlers.get(eventClass);

    if (executorList == null)
      return;

    SmashEventExecutor executor = eventHandler.getExecutor();
    executorList.remove(executor);
  }

  @EventHandler
  public void createDoubleJumpEvent(PlayerToggleFlightEvent event) {
    DoubleJumpEvent doubleJumpEvent = new DoubleJumpEvent(event.getPlayer());

    LinkedHashSet<SmashEventExecutor> doubleJumpEventExecutors = handlers.get(DoubleJumpEvent.class);

    if (doubleJumpEventExecutors == null)
      return;

    for (SmashEventExecutor eventExecutor : doubleJumpEventExecutors) {
      eventExecutor.execute(doubleJumpEvent);
    }

    event.setCancelled(true);
  }
}
