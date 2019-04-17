package io.github.supersmashexperiments.ssc.kit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.bukkit.Material;

import io.github.supersmashexperiments.ssc.kit.exception.DuplicateAbilityItemMaterialException;

public final class Abilities implements Iterable<Ability> {
  private final HashMap<Material, Ability> itemAbilities;
  private final List<Ability> nonItemAbilities;

  public Abilities() {
    this.itemAbilities = new HashMap<>();
    this.nonItemAbilities = new ArrayList<Ability>();
  }

  public Abilities(Iterable<Ability> abilities) throws DuplicateAbilityItemMaterialException {
    this.itemAbilities = new HashMap<>();
    this.nonItemAbilities = new ArrayList<Ability>();

    for (Ability ability : abilities) {
      this.add(ability);
    }
  }

  private void add(Ability ability) throws DuplicateAbilityItemMaterialException {
    AbilityItem abilityItem = ability.getAbilityItem();

    if (abilityItem == null) {
      this.nonItemAbilities.add(ability);
    } else {
      Material abilityItemMaterial = abilityItem.getMaterial();
      if (this.itemAbilities.get(abilityItemMaterial) != null) {
        throw new DuplicateAbilityItemMaterialException(abilityItemMaterial);
      } else {
        this.itemAbilities.put(abilityItem.getMaterial(), ability);
      }
    }
  }

  public Ability get(Material material) {
    return this.itemAbilities.get(material);
  }

  public Iterator<Ability> iterator() {
    Collection<Ability> abilities = new ArrayList<Ability>();
    abilities.addAll(this.itemAbilities.values());
    abilities.addAll(this.nonItemAbilities);

    return abilities.iterator();
  }
}

