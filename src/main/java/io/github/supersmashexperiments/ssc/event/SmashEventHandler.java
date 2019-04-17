package io.github.supersmashexperiments.ssc.event;

public class SmashEventHandler {
  private final Class<? extends SmashEvent> eventClass;
  private final SmashEventExecutor executor;

  public SmashEventHandler(Class<? extends SmashEvent> eventClass, SmashEventExecutor executor) {
    this.eventClass = eventClass;
    this.executor = executor;
  }

  public Class<? extends SmashEvent> getEventClass() {
    return this.eventClass;
  }

  public SmashEventExecutor getExecutor() {
    return this.executor;
  }

  public boolean equals(Object o) {
    if (!(o instanceof SmashEventHandler))
      return false;
    SmashEventHandler other = (SmashEventHandler) o;
    return eventClass.equals(other.getEventClass()) && executor.equals(other.getExecutor());
  }

  public int hashCode() {
    return eventClass.hashCode() ^ executor.hashCode();
  }
}
