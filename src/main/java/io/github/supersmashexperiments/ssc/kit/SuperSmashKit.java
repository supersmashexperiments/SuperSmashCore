package io.github.supersmashexperiments.ssc.kit;

public final class SuperSmashKit {
  private final String name;
  private final String description;
  private final Abilities abilities;
  private final Armor armor;

  public SuperSmashKit(String name, String description, Abilities abilities, Armor armor) {
    this.name = name;
    this.description = description;
    this.armor = armor;
    this.abilities = abilities;
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return this.description;
  }

  public Abilities getAbilities() {
    return this.abilities;
  }

  public Armor getArmor() {
    return this.armor;
  }
}
