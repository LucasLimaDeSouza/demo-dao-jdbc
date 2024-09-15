package application;


import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SellerDao sellerDao = DaoFactory.createSellerDao();// Importante!!!!!!!!!!!!!!!
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("******** Teste 1: Find By Id **********************************");
        Seller seller = sellerDao.findById(8);
        System.out.println(seller);

        System.out.println("******** Teste 2: Find By DepartmentId **********************************");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
            System.out.println("-----------------------------");
        }

        System.out.println("******** Teste 3: Find All **********************************");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println("------------- Seller: " + obj.getId() + " ----------------");
            System.out.println(obj);
        }

        System.out.println("******** Teste 4: Insert **********************************");
        /*
        System.out.println("Id: ");
        Integer id = sc.nextInt();

        System.out.println("Nome: ");
        String name = sc.next();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Data de Nascimento: ");
        String data = sc.next();
        Date dataFormat = sdf.parse(data);
        System.out.println("Salário: ");
        Double salary = sc.nextDouble();

        System.out.println("Departamento :");
        System.out.println("Numero do Departamento: ");
        Integer dpId = sc.nextInt();


        Department dp = new Department(dpId,null);
        sellerDao.insert(new Seller(name,email, dataFormat,salary,dp));

        for (Seller obj : list) {
            System.out.println("------------- Seller: " + obj.getId() + " ----------------");
            System.out.println(obj);
        }

        System.out.println("******** Teste 5: Update **********************************");

        System.out.println("Id: ");
        Integer attid = sc.nextInt();
        System.out.print("Nome: ");
        String attname = sc.next();
        System.out.println("Email: ");
        String attemail = sc.next();
        System.out.println("Data de Nascimento: ");
        String attdata = sc.next();
        Date attdataFormat = sdf.parse(attdata);
        System.out.println("Salário: ");
        Double attsalary = sc.nextDouble();

        System.out.println("Departamento :");
        System.out.println("Numero do Departamento: ");
        Integer attdpId = sc.nextInt();

        Department dp = new Department(attdpId,null);
        sellerDao.update(new Seller(attid,attname,attemail,attdataFormat,attsalary,dp));

        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println("------------- Seller: " + obj.getId() + " ----------------");
            System.out.println(obj);
        }
        */

        sellerDao.deleteById(12);
    }
}