package site.blbc.polymorphism.exte;

/**
 * 思考：如何更好访问父类的属性？
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-14
 */
public class SortedDynamicArray extends DynamicArray {

  /*
   * 有序数组的插入: O(n)
   */
  @Override
  public void add(Integer e) {
    ensureCapacity();
    int i;
    for (i = size - 1; i >= 0; --i) {
      if (elements[i] > e) {
        elements[i + 1] = elements[i];
      } else {
        break;
      }
    }
    elements[i + 1] = e; // 注意 for 循环的 --i
    ++size;
  }
}
