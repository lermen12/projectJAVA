package application;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws Exception {
        Connection connection = DB.createConnection();

        if (connection != null) {
            System.out.println("Conexão obtida com sucesso");
        } else {
            System.out.println("Erro de conexão");
        }
        Department department = new Department(1,"books");
        System.out.println(department);
        Seller seller = new Seller(21,"Lucas","menorlermen@gmail.com",new Date(),3000.0,department);
        System.out.println(seller);
    }
}
