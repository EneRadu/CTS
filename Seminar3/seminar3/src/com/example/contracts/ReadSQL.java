package com.example.contracts;

import java.sql.Connection;

public interface ReadSQL {
    public void readSQL(Connection connection, String name);
}
