package com.example.classes;

public class CreateNOSQL implements com.example.contracts.CreateNOSQL {
    @Override
    public void createNOSQL(MongoDatabase mongoDb, String name) {
        try {
            if (mongoDb.getCollection(name) != null) {
                mongoDb.getCollection(name).drop();
            }

            mongoDb.createCollection(name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
