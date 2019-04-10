package io.github.supersmashexperiments.kit;

import java.util.List;

public class SuperSmashKit {
  private final List<Ability> abilities;
  private final Armor armor;

  public SuperSmashKit(List<Ability> abilities, Armor armor) {
    this.armor = armor;
    this.abilities = abilities;
  }

  public List<Ability> getAbilities() {
    return this.abilities;
  }

  public Armor getArmor() {
    return this.armor;
  }
}
