package site.blbc.abst;

import java.io.IOException;
import java.util.logging.Level;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-21
 */
public class Example {

  public static void main(String[] args) throws IOException {
    Logger logger = new FileLogger("输出到日志文件", true, Level.ALL, "/Users/ian/log.tmp");
    logger.log(Level.ALL, "ABBC");

    logger = new MessageQueueLogger("输出到消息中间件", true, Level.ALL, new MessageQueueClient());
    logger.log(Level.ALL, "12341");
  }

}
