package com.example.classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class EstablishConnectionSQL implements com.example.contracts.EstablishConnectionSQL {
    @Override
    public Connection establishConnectionSQL() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            connection.setAutoCommit(false);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
