package com.example;

import com.example.contracts.*;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        System.out.println("Ce tip de baza de date doriti sa utilizati? \n (1) SQL \n (2) NOSQL");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Ce nume va avea 'table-ul'?");
        String name = scanner.nextLine();
        if(choice == 1){
            EstablishConnectionSQL establishConnection = new com.example.classes.EstablishConnectionSQL();
            Connection connection = establishConnection.establishConnectionSQL();
            CreateSQL createSQL = new com.example.classes.CreateSQL();
            createSQL.createSQL(connection, name);
            InsertSQL insertSQL = new com.example.classes.InsertSQL();
            insertSQL.insertSQL(connection, name);
            ReadSQL readSQL = new com.example.classes.ReadSQL();
            readSQL.readSQL(connection, name);
            CloseConnectionSQL closeConnectionSQL = new com.example.classes.CloseConnectionSQL();
            closeConnectionSQL.closeConnectionSQL(connection);
        }else if(choice == 2){
            EstablishConnectionNOSQL establishConnectionNOSQL = new com.example.classes.EstablishConnectionNOSQL();
            MongoClient mongoClient = establishConnectionNOSQL.establishConnectionNOSQL();
            MongoDatabase mongoDb = mongoClient.getDatabase("test");
            CreateNOSQL createNOSQL = new com.example.classes.CreateNOSQL();
            createNOSQL.createNOSQL(mongoDb, name);
            InsertNOSQL insertNOSQL = new com.example.classes.InsertNOSQL();
            insertNOSQL.insertNOSQL(mongoDb, name);
            ReadNOSQL readNOSQL = new com.example.classes.ReadNOSQL();
            readNOSQL.readNOSQL(mongoDb, name);
            CloseConnectionNOSQL closeConnectionNOSQL = new com.example.classes.CloseConnectionNOSQL();
            closeConnectionNOSQL.closeConnectionNOSQL(mongoClient);
        }
    }
}
