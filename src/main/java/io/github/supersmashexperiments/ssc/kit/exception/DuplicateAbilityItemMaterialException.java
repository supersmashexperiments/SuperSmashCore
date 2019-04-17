package io.github.supersmashexperiments.ssc.kit.exception;

import org.bukkit.Material;

public class DuplicateAbilityItemMaterialException extends RuntimeException {
  private final Material material;

  public DuplicateAbilityItemMaterialException(Material material) {
    super("Two or more ability items are using the " + material + " material");
    this.material = material;
  }

  public Material getMaterial() {
    return this.material;
  }
}

