package io.github.supersmashexperiments.kit;

import io.github.supersmashexperiments.kit.exception.DisguiseNotFoundException;
import me.libraryaddict.disguise.disguisetypes.Disguise;

public interface DisguiseStore {
  public Disguise get(String disguiseId) throws DisguiseNotFoundException;
}
