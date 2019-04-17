package io.github.supersmashexperiments.ssc.kit;

public class SuperSmashKit {
  private final Abilities abilities;
  private final Armor armor;

  public SuperSmashKit(Abilities abilities, Armor armor) {
    this.armor = armor;
    this.abilities = abilities;
  }

  public Abilities getAbilities() {
    return this.abilities;
  }

  public Armor getArmor() {
    return this.armor;
  }
}
