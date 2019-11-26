package site.blbc;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-26
 */
public class Ostrich implements Egglayable, Tweetable {
  // 组合
  private Egglaybility egglaybility = new Egglaybility();
  private Tweetbility tweetability = new Tweetbility();

  public void egglay() {
    // 委托
    egglaybility.egglay();
  }

  public void tweet() {
    // 委托
    tweetability.tweet();
  }

  public static void main(String[] args) {
    Ostrich ostrich = new Ostrich();
    ostrich.tweet();
    ostrich.egglay();
  }
}
