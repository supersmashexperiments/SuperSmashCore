package io.github.supersmashexperiments.ssc.kit;

import org.bukkit.Material;

public final class AbilityItem {
  private final Material material;
  private final int slot;
  private final String name;
  private final String action;

  public AbilityItem(Material material, int slot, String name, String action) {
    this.material = material;
    this.slot = slot;
    this.name = name;
    this.action = action;
  }

  public int getSlot() {
    return this.slot;
  }

  public Material getMaterial() {
    return this.material;
  }

  public String getName() {
    return this.name;
  }

  public String getAction() {
    return this.action;
  }
}

