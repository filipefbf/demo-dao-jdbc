package application;

import model.dao.DaoFatory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Date;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = new DaoFatory().createSellerDao();

        System.out.println("=== TEST 1:seller findById ====");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}