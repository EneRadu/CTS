package com.example.classes;

import com.example.contracts.EstablishConnectionSQL;

public class EstablishConnectionNOSQL implements com.example.contracts.EstablishConnectionNOSQL {
    @Override
    public MongoClient establishConnectionNOSQL() {
        try {
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            return mongoClient;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
