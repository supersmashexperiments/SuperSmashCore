package io.github.supersmashexperiments.kit;

import org.bukkit.Material;

public class Armor {
  private final Material boots;
  private final Material leggings;
  private final Material chestplate;
  private final Material helmet;

  public Armor(Material boots, Material leggings, Material chestplate, Material helmet) {
      this.boots = boots;
      this.leggings = leggings;
      this.chestplate = chestplate;
      this.helmet = helmet;
  }

  public Material getBoots() {
    return this.boots;
  }

  public Material getLeggings() {
    return this.leggings;
  }

  public Material getChestplate() {
    return this.chestplate;
  }

  public Material getHelmet() {
    return this.helmet;
  }
}

