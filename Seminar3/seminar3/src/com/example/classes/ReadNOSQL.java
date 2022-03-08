package com.example.classes;

public class ReadNOSQL implements com.example.contracts.ReadNOSQL {
    @Override
    public void readNOSQL(MongoDatabase mongoDb, String name) {
        try {
            MongoCollection<Document> collection = mongoDb.getCollection(name);
            FindIterable<Document> result = collection.find();
            for (Document doc : result) {
                System.out.println(doc);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
