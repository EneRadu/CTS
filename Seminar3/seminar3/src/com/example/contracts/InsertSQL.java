package com.example.contracts;

import java.sql.Connection;

public interface InsertSQL {
    public void insertSQL(Connection connection, String name);
}
