package com.example.classes;

import java.sql.Connection;

public class CloseConnectionSQL implements com.example.contracts.CloseConnectionSQL {
    @Override
    public void closeConnectionSQL(Connection connection){
        try {
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
