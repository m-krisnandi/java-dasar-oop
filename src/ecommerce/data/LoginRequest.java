package ecommerce.data;

public record LoginRequest(String username, String password) {
    public LoginRequest{
        System.out.println("Constructor utama dipanggil");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
