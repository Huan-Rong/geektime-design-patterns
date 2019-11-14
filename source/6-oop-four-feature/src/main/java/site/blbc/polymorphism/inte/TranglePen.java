package site.blbc.polymorphism.inte;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-14
 */
public class TranglePen implements Pen {

  private boolean isUsed = true;

  public boolean isUseful() {
    return this.isUsed;
  }

  public void draw() {
    System.out.println("trangle...");
  }
}
