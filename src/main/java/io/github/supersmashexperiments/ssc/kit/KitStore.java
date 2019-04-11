package io.github.supersmashexperiments.ssc.kit;

import io.github.supersmashexperiments.ssc.kit.SuperSmashKit;
import io.github.supersmashexperiments.ssc.kit.exception.KitNotFoundException;

public interface KitStore {
  public SuperSmashKit get(Tag tag) throws KitNotFoundException;
}
