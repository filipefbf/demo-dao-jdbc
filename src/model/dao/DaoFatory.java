package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFatory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
