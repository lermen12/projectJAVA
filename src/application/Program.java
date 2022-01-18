package application;

import db.DB;
import java.sql.Connection;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

  public static void main(String[] args) throws Exception {
    Connection connection = DB.createConnection();
    SellerDao sellerDao = DaoFactory.createSellerDao();

    System.out.println("=== Teste 1: seller findById ======");
    Seller seller = sellerDao.findById(3);
    System.out.println(seller);
    System.out.println("\n=== Teste 2: seller findByDepartment ======");
    Department department = new Department(2, null);
    List<Seller> list = sellerDao.findByDepartment(department);
      for (Seller seller1 : list) {
          System.out.println(seller1);
      }
      System.out.println("\n=== Teste 3: seller findAll ======");
            list = sellerDao.findAll();
      for (Seller seller1 : list) System.out.println(seller1);

  }
}
