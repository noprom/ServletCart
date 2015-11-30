package entity;

/**
 * Created by noprom on 11/30/15.
 */
public class Items {
    private int id; // 商品id
    private String name; // 商品名称
    private String city; // 所在城市
    private int price; // 价格
    private int number; // 数量
    private String picture; // 图片

    public Items() {

    }

    public Items(int id, String name, String city, int price, int number, String picture) {
        this.id = id;
        this.name = name;

        this.city = city;
        this.price = price;
        this.number = number;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public int hashCode() {
        return this.getId()+this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(obj instanceof Items)
        {
            Items i = (Items)obj;
            if(this.getId()==i.getId()&&this.getName().equals(i.getName()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString() {
        return "id = " + this.getId() + ", name = " + this.getName() + ", price = " + this.price;
    }
}
