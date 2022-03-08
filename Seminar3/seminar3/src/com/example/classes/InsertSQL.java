package com.example.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertSQL implements com.example.contracts.InsertSQL {
    @Override
    public void insertSQL(Connection connection, String name) {
        try {
            String sqlInsert = "INSERT INTO "+name+" VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlInsert);
            statement.close();

            String sqlInsertWithParams = "INSERT INTO "+name+" VALUES (?,?,?,?)";
            PreparedStatement preparedStatement =
                    connection.prepareStatement(sqlInsertWithParams);
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Ionescu Vasile");
            preparedStatement.setString(3, "Brasov");
            preparedStatement.setDouble(4, 4500);
            preparedStatement.executeUpdate();
            preparedStatement.close();

            connection.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
