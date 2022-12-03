package model.dao;

import modelDaoImpl.SellerDaoJDBC;

public class DaoFactory {

    public static SelllerDao createSellerDao(){
        return new SellerDaoJDBC();
    }


}
