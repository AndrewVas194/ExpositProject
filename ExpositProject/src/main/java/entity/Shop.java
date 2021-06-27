package entity;

import java.util.Objects;

public class Shop {

    private static int count = 0;

    private String nameOfCompany;
    private String mailOfCompany;
    private int countOfProduct;
    private Product shopProduct;

    private int shopId=0;

    public Shop(){
        shopId=count++;
    }

    public String getNameOfCompany() { return nameOfCompany; }
    public void setNameOfCompany(String nameOfCompany) { this.nameOfCompany = nameOfCompany; }

    public String getMailOfCompany() { return mailOfCompany; }
    public void setMailOfCompany(String mailOfCompany) { this.mailOfCompany = mailOfCompany; }

    public int getCountOfProduct() { return countOfProduct; }
    public void setCountOfProduct(int countOfProduct) { this.countOfProduct = countOfProduct; }

    public Product getShopProduct() { return shopProduct; }
    public void setShopProduct(Product shopProduct) { this.shopProduct = shopProduct; }

    public Shop(String nameOfCompany, String mailOfCompany, int countOfProduct,Product product) {
        this.nameOfCompany = nameOfCompany;
        this.mailOfCompany = mailOfCompany;
        this.countOfProduct=countOfProduct;
        this.shopProduct = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop that = (Shop) o;
        return shopId == that.shopId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId);
    }

}
