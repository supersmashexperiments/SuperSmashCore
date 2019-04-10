package io.github.supersmashexperiments.kit;

import java.util.List;

public class Ability {
  private final String name;
  private final List<EventHandler> eventHandlers;
  private final AbilityItem abilityItem;

  public Ability(String name, List<EventHandler> eventHandlers, AbilityItem abilityItem) {
    this.name = name;
    this.abilityItem = abilityItem;
    this.eventHandlers = eventHandlers;
  }

  public String getName() {
    return this.name;
  }

  public AbilityItem getAbilityItem() {
    return this.abilityItem;
  }

  public List<EventHandler> getEventHandlers() {
    return this.eventHandlers;
  }
}
