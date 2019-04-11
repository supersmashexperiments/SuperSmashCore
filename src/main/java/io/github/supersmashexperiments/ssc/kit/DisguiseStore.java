package io.github.supersmashexperiments.ssc.kit;

import io.github.supersmashexperiments.ssc.kit.exception.DisguiseNotFoundException;
import me.libraryaddict.disguise.disguisetypes.Disguise;

public interface DisguiseStore {
  public Disguise get(String disguiseId) throws DisguiseNotFoundException;
}
