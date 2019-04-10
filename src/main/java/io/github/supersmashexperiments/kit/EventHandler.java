package io.github.supersmashexperiments.kit;

import org.bukkit.event.Event;
import org.bukkit.plugin.EventExecutor;

public class EventHandler {
  private final Class<? extends Event> eventClass;
  private final EventExecutor executor;

  public EventHandler(Class<? extends Event> eventClass, EventExecutor executor) {
    this.eventClass = eventClass;
    this.executor = executor;
  }

  public Class<? extends Event> getEventClass() {
    return this.eventClass;
  }

  public EventExecutor getExecutor() {
    return this.executor;
  }
}
