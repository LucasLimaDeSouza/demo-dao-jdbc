package application;

import model.entities.Department;
import model.entities.Seller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Lucas", "lulu@gmail.com", new Date(),3000.0, obj);
        System.out.println(seller);
    }
}