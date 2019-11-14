package site.blbc.polymorphism.exte;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-14
 */
public class DynamicArray {

  private static final int DEFAULT_CAPACITY = 10;
  protected int size = 0;
  protected int capacity = DEFAULT_CAPACITY;
  protected Integer[] elements = new Integer[DEFAULT_CAPACITY];

  public int size() {
    return this.size;
  }

  public Integer get(int index) {
    return elements[index];
  }

  public void add(Integer e) {
    ensureCapacity();
    elements[size++] = e;
  }

  protected void ensureCapacity() {
    //如果数组满了，那么就扩容
  }
}
