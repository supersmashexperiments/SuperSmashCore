package io.github.supersmashexperiments.ssc.kit;

import java.util.List;

public final class Ability {
  private final String name;
  private final String description;
  private final List<EventHandler> eventHandlers;
  private final AbilityItem abilityItem;

  public Ability(String name, String description, List<EventHandler> eventHandlers, AbilityItem abilityItem) {
    this.name = name;
    this.description = description;
    this.abilityItem = abilityItem;
    this.eventHandlers = eventHandlers;
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return this.description;
  }

  public AbilityItem getAbilityItem() {
    return this.abilityItem;
  }

  public List<EventHandler> getEventHandlers() {
    return this.eventHandlers;
  }
}
