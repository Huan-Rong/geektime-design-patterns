package site.blbc.encapsulation;

import java.math.BigDecimal;

/**
 * Wallet 类用于说明封装特性。
 *
 * 设计的特点
 *   1.id 使用 String 类型
 *   2.时间使用 long 类型
 *   3.余额使用 BigDecimal 类型
 *   4.使用了业务层异常
 *
 * 阅读提醒
 *   1.应当注意理解：暴露有限的接口
 *
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-14
 */
public class Wallet {

  //成员变量，即要封装的信息
  private String id;
  private long createTime;
  private BigDecimal balance;
  private long balanceLastModifiedTime;

  public Wallet() {
    //this.id = IdGenerator.getInstance().generate();
    this.createTime = System.currentTimeMillis();
    this.balance = BigDecimal.ZERO;
    this.balanceLastModifiedTime = System.currentTimeMillis();
  }

  /*
   * 暴露有限的接口，这里注意理解“有限”一词的含义，并非所有的属性都需要 getter/setter 方法，这需要根据业务要决定。
   * 另外，通常还会出现 increaseBalance() 这样的方法，这也是分析业务特点后决定的。
   *
   * id, createTime 这两个属性在创建钱包时就确定好了，之后不应该再改动。
   * 因此，这里没有任何关于这两个字段的修改方法，比如 setter。
   *
   * 另外，这两个字段的初始化设置，对于 Wallet 类的调用者来说，应该是透明的。
   * 因此，应当在 Wallet 类的构造方法内部将其初始化设置好，而不是通过构造方法的参数来外部赋值。
   */
  public String getId() {
    return this.id;
  }

  public long getCreateTime() {
    return this.createTime;
  }

  /*
   * 对于 balance 这个属性，从业务的角度来讲，只能增减，不能被重新设置。
   * 因此，我们应该只暴露 increaseBalance() 和 decreaseBalance() 方法，而不应该暴露 setter。
   *
   * 对于 balanceLastModifiedTime，这个属性是和 balance 绑定在一起的，当 balance 属性修改时，它才会发生修改。
   * 因此对于这个属性的修改操作也被封装到 increaseBalance() 和 decreaseBalance() 方法中。这样也保证了这两个信息的一致性。
   */
  public BigDecimal getBalance() {
    return this.balance;
  }

  public long getBalanceLastModifiedTime() {
    return this.balanceLastModifiedTime;
  }

  public void increaseBalance(BigDecimal increasedAmount) {
    if (increasedAmount.compareTo(BigDecimal.ZERO) < 0) {
      // 业务层异常
      //throw new InvalidAmountException("...");
    }
    this.balance.add(increasedAmount);
    this.balanceLastModifiedTime = System.currentTimeMillis();
  }

  public void decreaseBalance(BigDecimal decreasedAmount) {
    if (decreasedAmount.compareTo(BigDecimal.ZERO) < 0) {
      //throw new InvalidAmountException("...");
    }
    if (decreasedAmount.compareTo(this.balance) > 0) {
      // 业务层异常
      //throw new InsufficientAmountException("...");
    }
    this.balance.subtract(decreasedAmount);
    this.balanceLastModifiedTime = System.currentTimeMillis();
  }
}
