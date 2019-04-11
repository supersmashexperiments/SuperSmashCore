package io.github.supersmashexperiments.kit.exception;

public class DisguiseNotFoundException extends Exception {
  private final String disguiseId;

  public DisguiseNotFoundException(String disguiseId) {
    super("The disguise identified by \"" + disguiseId + "\" could not be found");
    this.disguiseId = disguiseId;
  }

  public String getDisguiseId() {
    return this.disguiseId;
  }
}
