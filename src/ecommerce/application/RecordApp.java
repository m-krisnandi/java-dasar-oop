package ecommerce.application;

import ecommerce.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Muhamad Krisnandi", "secret");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("muhamadkrisnandi"));
        System.out.println(new LoginRequest("muhamadkrisnandi", "secret"));
    }
}
