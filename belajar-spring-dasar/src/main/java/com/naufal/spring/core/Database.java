/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.spring.core;

/**
 *
 * @author IIISI
 */
public class Database {
    
    private static Database database;
    
    public static Database getInstance(){
        if (database == null) {
            database = new Database();
        }
        return database;
    }
    
    private Database(){
        
    }
}
