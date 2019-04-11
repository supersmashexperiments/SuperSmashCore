package io.github.supersmashexperiments.ssc.kit.exception;

import io.github.supersmashexperiments.ssc.kit.Tag;

public class KitNotFoundException extends Exception {
  private final Tag tag;

  public KitNotFoundException(Tag tag) {
    super("The kit identified by \"" + tag + "\" could not be found");
    this.tag = tag;
  }

  public Tag getTag() {
    return this.tag;
  }
}
