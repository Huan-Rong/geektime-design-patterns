package site.blbc.abst;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-21
 */
public class FileLogger extends Logger {

  private FileWriter fileWriter;

  public FileLogger(String name, boolean enabled, Level minPermittedLevel, String filePath)
      throws IOException {
    super(name, enabled, minPermittedLevel);
    fileWriter = new FileWriter(filePath);
  }

  @Override
  protected void doLog(Level level, String message) {
    // 格式化 level 和 message，输出到日志文件
    System.out.println("file logging: " + message);
  }
}
