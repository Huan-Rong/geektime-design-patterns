package site.blbc.abst;

import java.util.logging.Level;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-21
 */
public abstract class Logger {

  private String name;
  private boolean enabled;
  private Level minPermittedLevel;

  public Logger(String name, boolean enabled, Level minPermittedLevel) {
    this.name = name;
    this.enabled = enabled;
    this.minPermittedLevel = minPermittedLevel;
  }

  public void log(Level level, String message) {
    boolean loggable = enabled && (minPermittedLevel.intValue() <= level.intValue());
    if (!loggable) {
      return;
    }
    doLog(level, message);
  }

  protected abstract void doLog(Level level, String message);
}