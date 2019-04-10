package io.github.supersmashexperiments.kit;

import org.bukkit.Material;

public class AbilityItem {
  private final Material material;
  private final int slot;
  private final String name;
  private final String action;
  private final String lore;

  public AbilityItem(Material material, int slot, String name, String action, String lore) {
    this.material = material;
    this.slot = slot;
    this.name = name;
    this.action = action;
    this.lore = lore;
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

  public String getLore() {
    return this.lore;
  }
}

