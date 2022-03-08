package com.example.contracts;

import java.sql.Connection;

public interface CreateSQL {
    public void createSQL(Connection connection, String name);
}
