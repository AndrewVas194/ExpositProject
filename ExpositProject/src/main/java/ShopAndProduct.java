import entity.Client;
import entity.Product;
import entity.Shop;

public class ShopAndProduct {

private Client client;
private Shop shop;

    public void addClient(String name,String number,String mail,String address){
        Client client = new Client();
        client.setName(name);
        client.setNumber(number);
        client.setMail(mail);
        client.setAddress(address);

    }
    public void outShop(String nameOfCompany, String mailOfCompany, Product shopProduct){

        shop.getNameOfCompany();
        shop.getMailOfCompany();
        shop.getShopProduct();

    }
}
