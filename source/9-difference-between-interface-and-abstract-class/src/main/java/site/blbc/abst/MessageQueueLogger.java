package site.blbc.abst;

import java.util.logging.Level;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-21
 */
public class MessageQueueLogger extends Logger {

  private MessageQueueClient msgQueueClient;

  public MessageQueueLogger(String name, boolean enabled, Level minPermittedLevel,
      MessageQueueClient msgQueueClient) {
    super(name, enabled, minPermittedLevel);
    this.msgQueueClient = msgQueueClient;
  }

  @Override
  protected void doLog(Level level, String message) {
    // 格式化 level 和 message，输出到消息中间件
    System.out.println("msg queue logging: " + message);
  }
}
