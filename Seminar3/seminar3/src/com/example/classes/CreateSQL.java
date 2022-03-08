package com.example.classes;

import java.sql.Connection;
import java.sql.Statement;

public class CreateSQL implements com.example.contracts.CreateSQL {

    @Override
    public void createSQL(Connection connection, String name) {
        try {
            String sqlDrop = "DROP TABLE IF EXISTS "+name;
            String sqlCreate = "CREATE TABLE "+name+"(id INTEGER PRIMARY KEY,"
                    + "name TEXT, address TEXT, salary REAL)";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlDrop);
            statement.executeUpdate(sqlCreate);
            statement.close();
            connection.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
