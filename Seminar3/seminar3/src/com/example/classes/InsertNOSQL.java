package com.example.classes;

public class InsertNOSQL implements com.example.contracts.InsertNOSQL {
    @Override
    public void insertNOSQL(MongoDatabase mongoDb, String name) {
        try {
            MongoCollection<Document> collection = mongoDb.getCollection(name);

            Document employee1 = new Document().append("name", "Popescu Ion").
                    append("address", "Bucharest").append("salary", 4000);
            collection.insertOne(employee1);

            Document employee2 = new Document().append("name", "Ionescu Vasile").
                    append("salary", 4500);
            collection.insertOne(employee2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
