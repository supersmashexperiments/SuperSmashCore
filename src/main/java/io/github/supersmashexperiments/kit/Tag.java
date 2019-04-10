package io.github.supersmashexperiments.kit;

public class Tag {
  private static final String delimiter = "/";
  private static final String creatorNamePattern = "[a-zA-Z_]{1,16}";
  private static final String kitNamePattern = "[a-zA-Z_]{1,16}";

  private String creator;
  private String kitName;

  public Tag(String tagString) {
    if (!tagString.contains(delimiter)) {
      throw new RuntimeException(tagString + " does not contain the \"" + delimiter + "\" delimiter");
    }

    String[] disassembledTag = tagString.split(delimiter);
    if (disassembledTag.length != 2) {
      throw new RuntimeException(tagString + " contains too many \"" + delimiter + "\" delimiters");
    }

    String creator = disassembledTag[0];
    String kitName = disassembledTag[1];

    if (!creator.matches(creatorNamePattern)) {
      throw new RuntimeException("the creator name \"" + creator + "\" is incorrectly formatted");
    }

    if (!kitName.matches(kitNamePattern)) {
      throw new RuntimeException("the kit name \"" + kitName + "\" is incorrectly formatted");
    }

    this.creator = creator;
    this.kitName = kitName;
  }

  public Tag(String creator, String kitName) {
    if (!creator.matches(creatorNamePattern)) {
      throw new RuntimeException("the creator name \"" + creator + "\" is incorrectly formatted");
    }

    if (!kitName.matches(kitNamePattern)) {
      throw new RuntimeException("the kit name \"" + kitName + "\" is incorrectly formatted");
    }

    this.creator = creator;
    this.kitName = kitName;
  }

  public String getCreator() {
    return this.creator;
  }

  public String getKitName() {
    return this.kitName;
  }

  @Override
  public String toString() {
    return this.creator + delimiter + this.kitName;
  }
}
