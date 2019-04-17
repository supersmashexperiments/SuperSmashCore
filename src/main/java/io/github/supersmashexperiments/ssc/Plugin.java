package io.github.supersmashexperiments.ssc;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
  private Controller controller;

  @Override
  public void onEnable() {
    this.controller = new Controller(this);
  }
}

