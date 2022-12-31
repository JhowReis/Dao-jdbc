package application;

import model.dao.DaoFactory;
import model.dao.SelllerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;


public class Program {
    public static void main(String[] args) {

        SelllerDao selllerDao = DaoFactory.createSellerDao();
        System.out.println("==== TEST 1: Seller findById ====s");

        Seller seller = selllerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==== TEST 2: Seller findByDepartment ====s");
        Department department = new Department(2, null);
        List<Seller> list = selllerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }
    }
}
