package entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by noprom on 11/30/15.
 */
public class Cart {

    //购买商品的集合
    private HashMap<Items, Integer> goods;

    //购物车的总金额
    private double totalPrice;

    public Cart() {
        goods = new HashMap<Items, Integer>();
        totalPrice = 0.0f;
    }

    public Cart(HashMap<Items, Integer> goods, double totalPrice) {
        this.goods = goods;
        this.totalPrice = totalPrice;
    }

    public HashMap<Items, Integer> getGoods() {
        return goods;
    }

    public void setGoods(HashMap<Items, Integer> goods) {
        this.goods = goods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    //添加商品进购物车
    public boolean addGoodsInCart(Items item, int number) {
        goods.put(item, number);
        calTotalPrice();
        return true;
    }

    //从购物车删除商品
    public boolean removeGoodFromCart(Items item) {
        goods.remove(item);
        calTotalPrice();
        return true;
    }

    //统计购物车总金额
    public double calTotalPrice() {
        double sum = 0.0;
        Set<Items> keys = goods.keySet();
        Iterator<Items> it = keys.iterator();
        while (it.hasNext()) {
            Items i = it.next();
            sum += i.getPrice() * goods.get(i);
        }
        this.setTotalPrice(sum);
        return this.getTotalPrice();
    }
}
