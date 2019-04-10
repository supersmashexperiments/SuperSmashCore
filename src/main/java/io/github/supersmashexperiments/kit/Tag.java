package io.github.supersmashexperiments.kit;

import io.github.supersmashexperiments.kit.exception.InvalidTagException;

public class Tag {
  private static final String delimiter = "/";
  private static final String creatorNamePattern = "[a-zA-Z_]{1,16}";
  private static final String kitNamePattern = "[a-zA-Z_]{1,16}";

  private String creator;
  private String kitName;

  public Tag(String tagString) throws InvalidTagException {
    if (!tagString.contains(delimiter)) {
      throw new InvalidTagException(tagString, "tag does not contain the \"" + delimiter + "\" delimiter");
    }

    String[] disassembledTag = tagString.split(delimiter);
    if (disassembledTag.length != 2) {
      throw new InvalidTagException(tagString, "tag contains too many \"" + delimiter + "\" delimiters");
    }

    String creator = disassembledTag[0];
    String kitName = disassembledTag[1];

    if (!creator.matches(creatorNamePattern)) {
      throw new InvalidTagException(creator + delimiter + kitName, "the creator name is incorrectly formatted");
    }

    if (!kitName.matches(kitNamePattern)) {
      throw new InvalidTagException(creator + delimiter + kitName, "the kit name is incorrectly formatted");
    }

    this.creator = creator;
    this.kitName = kitName;
  }

  public Tag(String creator, String kitName) throws InvalidTagException {
    if (!creator.matches(creatorNamePattern)) {
      throw new InvalidTagException(creator + delimiter + kitName, "the creator name is incorrectly formatted");
    }

    if (!kitName.matches(kitNamePattern)) {
      throw new InvalidTagException(creator + delimiter + kitName, "the kit name is incorrectly formatted");
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
