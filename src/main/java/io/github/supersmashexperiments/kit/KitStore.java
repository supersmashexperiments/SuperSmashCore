package io.github.supersmashexperiments.kit;

import io.github.supersmashexperiments.kit.SuperSmashKit;
import io.github.supersmashexperiments.kit.exception.KitNotFoundException;

public interface KitStore {
  public SuperSmashKit get(Tag tag) throws KitNotFoundException;
}
