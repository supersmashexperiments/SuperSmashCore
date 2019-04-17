package io.github.supersmashexperiments.ssc.event;

public interface SmashEventExecutor<T extends SmashEvent> {
  public void execute(T event);
}
