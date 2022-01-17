package application;

import db.DB;
import model.entities.Department;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) throws Exception {
        Connection connection = DB.createConnection();

        if (connection != null) {
            System.out.println("Conexão obtida com sucesso");
        } else {
            System.out.println("Erro de conexão");
        }

    }
}
