package io.github.supersmashexperiments.kit.exception;

import io.github.supersmashexperiments.kit.Tag;

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
