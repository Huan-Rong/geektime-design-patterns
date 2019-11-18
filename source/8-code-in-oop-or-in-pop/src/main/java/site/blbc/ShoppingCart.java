package site.blbc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: Ian Zheng
 * @date: 2019-11-18
 */
public class ShoppingCart {

  private int itemCount;
  private double totalPrice;
  private List<ShoppingCartItem> items = new ArrayList<ShoppingCartItem>();

  /* 只有当 items 发生变化，itemCount 和 totalPrice 这两个属性的值才发生变化。
   * 因此，对于这两个属性不应该定义独立的 setter 方法。
   */
  public int getItemCount() {
    return this.itemCount;
  }

  public void setItemCount(int itemCount) {
    this.itemCount = itemCount;
  }

  public double getTotalPrice() {
    return this.totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  /*
   * getter 直接返回容器对象，那么调用者在拿到容器对象时，就可以操作容器内部的数据。
   * 也就是说，这样子的操作也破坏了 OOP 的封装性，使得数据暴露给外部。
   *
   * Java 中可以使用 Collections.unmodifiableList() 来返回一个不可修改的集合容器。
   * 这样提供给外部的数据就是不可修改的。
   */
  public List<ShoppingCartItem> getItems() {
//    return this.items;
    return Collections.unmodifiableList(this.items);
  }

  public void addItem(ShoppingCartItem item) {
    items.add(item);
    itemCount++;
    totalPrice += item.getPrice();
  }

  /*
   * 定义清空购物车的方法，相关属性的操作也需要在这里进行
   */
  public void clear() {
    items.clear();
    itemCount = 0;
    totalPrice = 0.0;
  }
}
