package io.github.supersmashexperiments.kit.exception;

public class InvalidTagException extends Exception {
  private final String tag;

  public InvalidTagException(String tag) {
    super("The string \"" + tag + "\" is not a valid tag");
    this.tag = tag;
  }

  public InvalidTagException(String tag, String message) {
    super("The string \"" + tag + "\" is not a valid tag: " + message);
    this.tag = tag;
  }

  public String getPassedTag() {
    return this.tag;
  }
}
