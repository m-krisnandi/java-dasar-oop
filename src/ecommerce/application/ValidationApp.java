package ecommerce.application;

import ecommerce.annotation.Fancy;
import ecommerce.data.LoginRequest;
import ecommerce.error.BlankException;
import ecommerce.error.ValidationException;
import ecommerce.util.ValidationUtil;

public class ValidationApp {
    @Fancy(name = "ValidationApp", tags = {"application", "java"})
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, "pswd");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid: " + exception.getMessage());
        } finally {
            System.out.println("Selalu dieksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest("ada", null);
        try {
            ValidationUtil.validateRuntime(loginRequest1);
            System.out.println("Success");
        } catch (NullPointerException | BlankException exception) {
            System.out.println("Data tidak valid " + exception.getMessage());
        }
    }
}
