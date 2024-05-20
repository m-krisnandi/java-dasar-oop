package ecommerce.application;

import ecommerce.data.CreateUserRequest;
import ecommerce.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("user");
        request.setPassword("anu");
        request.setName("");

        ValidationUtil.validationReflection(request);
    }
}
