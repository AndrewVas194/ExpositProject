

import entity.Category;
import entity.Client;
import entity.Product;
import entity.Shop;

import java.io.*;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;


import static entity.Category.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File fileClient = new File("DataBase.txt");
        File fileShop = new File("DataBase.txt");
        BufferedReader br=null;
        Scanner in = new Scanner(System.in);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileClient, true));


            Client client = new Client();
            client.setName("Misha"+"\n");
            writer.write(client.getName());
            client.setNumber("3752928111111"+"\n");
            writer.write(client.getNumber());
            client.setMail("Mimisha@gmail.comsha"+"\n");
            writer.write(client.getMail());
            client.setAddress("leninskaya_53"+"\n");
            writer.write(client.getAddress()+"\n");
            writer.write("\n");
            writer.close();

        }catch (IOException ex) {
            ex.printStackTrace();
        }System.out.println("Клиент добавлен!");



        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileShop, true));

            List<Category> categories = new ArrayList<>();
            categories.add(DESSERT);
            categories.add(MILKY);
            Product product = new Product("chocolate bar", 15, categories);

            Shop shop=new Shop();
            shop.setNameOfCompany("MilkyWay");
            writer.write(shop.getNameOfCompany()+"\n");
            shop.setMailOfCompany("MW@gmail.com");
            writer.write(shop.getMailOfCompany()+"\n");
            shop.setCountOfProduct(20);
            writer.write(shop.getCountOfProduct()+"\n");
            shop.setShopProduct(product);
            writer.write(product.getProductName()+"\n");
            writer.write(product.getPrice()+"\n");

            writer.close();

        }catch (IOException ix) {
            ix.printStackTrace();
        }

    }
}
