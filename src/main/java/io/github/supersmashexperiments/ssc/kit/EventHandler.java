package io.github.supersmashexperiments.ssc.kit;

import java.util.AbstractMap;
import java.util.Map;

import org.bukkit.event.Event;
import org.bukkit.plugin.EventExecutor;

public class EventHandler extends AbstractMap.SimpleImmutableEntry<Class<? extends Event>, EventExecutor> {
  private final Class<? extends Event> eventClass;
  private final EventExecutor executor;

  public EventHandler(Class<? extends Event> eventClass, EventExecutor executor) {
    super(eventClass, executor);
    this.eventClass = eventClass;
    this.executor = executor;
  }

  public EventHandler(Map.Entry<Class<? extends Event>, EventExecutor> tuple) {
    super(tuple);
    this.eventClass = tuple.getKey();
    this.executor = tuple.getValue();
  }

  public Class<? extends Event> getEventClass() {
    return this.eventClass;
  }

  public EventExecutor getExecutor() {
    return this.executor;
  }
}
