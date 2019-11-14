package site.blbc.polymorphism.inte;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-14
 */
public class Example {

  private static void print(Pen pen) {
    if (pen.isUseful() == true) {
      pen.draw();
    }
  }

  public static void main(String[] args) {
    CyclePen cyclePen = new CyclePen();
    print(cyclePen);

    System.out.println("---------------");

    TranglePen tranglePen = new TranglePen();
    print(tranglePen);
  }
}
