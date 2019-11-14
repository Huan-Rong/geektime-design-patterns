package site.blbc.polymorphism.exte;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-14
 */
public class Example {
  public static void print3Ele(DynamicArray dynamicArray) {
    dynamicArray.add(5);
    dynamicArray.add(1);
    dynamicArray.add(3);
    for (int i = 0; i < dynamicArray.size(); i++) {
      System.out.println(dynamicArray.get(i));
    }
  }

  public static void main(String[] args) {
    DynamicArray dynamicArray = new SortedDynamicArray();
    print3Ele(dynamicArray);

    System.out.println("------------");

    DynamicArray dynamicArray1 = new DynamicArray();
    print3Ele(dynamicArray1);
  }
}
