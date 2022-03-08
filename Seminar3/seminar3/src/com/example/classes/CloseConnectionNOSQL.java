package com.example.classes;

public class CloseConnectionNOSQL implements com.example.contracts.CloseConnectionNOSQL {
    @Override
    public void closeConnectionNOSQL(MongoClient mongoClient) {
        try {
            mongoClient.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
