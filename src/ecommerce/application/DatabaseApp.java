package ecommerce.application;

import ecommerce.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("postgres", "secret");
        System.out.println("Connection to DB success");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
