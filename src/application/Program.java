package application;

import model.entities.Department;
import model.entities.Seller;
import java.util.Date;

public class Program {
    public static void main(String[] args) {



        Department obj = new Department(1, "Books");
        Seller seller = new Seller(2,"jonathan","joanthan@teste.com",new Date(),3.000,obj);

        System.out.println(seller);
    }
}
