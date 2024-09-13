package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("******** Teste 1: Find By Id ********");
        Seller seller = sellerDao.findById(8);
        System.out.println(seller);

        System.out.println("******** Teste 2: Find By DepartmentId ********");
        Department department = new Department(1,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj: list) {
            System.out.println(obj);
            System.out.println("-----------------------------");
        }

    }
}