package application;

import model.dao.DaoFactory;
import model.dao.SelllerDao;
import model.entities.Seller;


public class Program {
    public static void main(String[] args) {

        SelllerDao selllerDao = DaoFactory.createSellerDao();
        System.out.println("==== TEST 1: Seller findById ====s");

        Seller seller = selllerDao.findById(3);
        System.out.println(seller);
    }
}
