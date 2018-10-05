package com.example.thymeleafdemo;

public class Product {

    // 编号
    private Long id;

    // 标题
    private String title;

    //价格（分,需要展示为元）
    private int price;

    // 折扣率(百分比,0.xx)
    private float discountPercent;

    public Product(Long id, String title, int price, float discountPercent) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.discountPercent = discountPercent;
    }

    // 这个方法用于格式化价格
    public String formatedPrice(){
        return String.format("%.02f",(float)price/100);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(float discountPercent) {
        this.discountPercent = discountPercent;
    }
}
