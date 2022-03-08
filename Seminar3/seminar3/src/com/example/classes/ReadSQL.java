package com.example.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadSQL implements com.example.contracts.ReadSQL {
    @Override
    public void readSQL(Connection connection, String name) {
        try {
            String sqlSelect = "SELECT * FROM "+name;
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sqlSelect);
            while(rs.next()) {
                int id = rs.getInt("id");
                System.out.println("id: " + id);
                String name_ = rs.getString(2);
                System.out.println("name: " + name_);
                String address = rs.getString("address");
                System.out.println("address: " + address);
                double salary = rs.getDouble("salary");
                System.out.println("salary: " + salary);
            }
            rs.close();
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
