package model.dao;

import db.DB;
import modelDaoImpl.SellerDaoJDBC;

public class DaoFactory {

    public static SelllerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }


}
