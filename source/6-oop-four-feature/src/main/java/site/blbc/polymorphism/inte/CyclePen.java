package site.blbc.polymorphism.inte;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-14
 */
public class CyclePen implements Pen {
  private boolean[] is_used = new boolean[]{ true };


  public boolean isUseful() {
    return is_used[0];
  }

  public void draw() {
    System.out.println("cycle...");
  }
}
