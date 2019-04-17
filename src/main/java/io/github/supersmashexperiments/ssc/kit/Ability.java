package io.github.supersmashexperiments.ssc.kit;

import io.github.supersmashexperiments.ssc.event.SmashEventHandler;

public final class Ability {
  private final String name;
  private final String description;
  private final SmashEventHandler[] eventHandlers;
  private final AbilityItem abilityItem;

  public Ability(String name, String description, SmashEventHandler[] eventHandlers, AbilityItem abilityItem) {
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

  public SmashEventHandler[] getEventHandlers() {
    return this.eventHandlers;
  }
}
