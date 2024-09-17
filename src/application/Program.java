package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) throws ParseException {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("******************** INSERT ++++++++++++++++++++++++++++++++++++++++");
        Department dp = new Department(null,"Music");
        departmentDao.insert(dp);

        System.out.println("******************** UPDATE ++++++++++++++++++++++++++++++++++++++++");
        Department dp2 = new Department(1, "Computer");
        departmentDao.update(dp2);

        System.out.println("******************** DELETE ++++++++++++++++++++++++++++++++++++++++");
        departmentDao.deleteById(4);

        System.out.println("******************** FIND BY ID ++++++++++++++++++++++++++++++++++++++++");


        List<Department> list = new ArrayList<>();

        list.add(departmentDao.findById(4));

        for (Department obj: list) {
            System.out.println("------------ Departament: " + obj.getId() + "---------------");
            System.out.println(obj);
        }
        System.out.println("******************** FIND ALL ++++++++++++++++++++++++++++++++++++++++");
        list = departmentDao.findAll();

        for (Department obj: list) {
            System.out.println(obj);
        }
    }
}