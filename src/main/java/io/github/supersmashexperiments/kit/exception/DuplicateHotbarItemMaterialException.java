package io.github.supersmashexperiments.kit.exception;

import org.bukkit.Material;

public class DuplicateHotbarItemMaterialException extends Exception {
  private final Material material;

  public DuplicateHotbarItemMaterialException(Material material) {
    super("Two or more hotbar items are using the " + material + " material");
    this.material = material;
  }

  public Material getMaterial() {
    return this.material;
  }
}

