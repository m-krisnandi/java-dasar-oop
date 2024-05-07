package ecommerce.data;

public class SosialMedia {
    String name;
}

final class Facebook extends SosialMedia {

}
// ERROR karena class sudah final (tidak bisa diturunkan)
//class FakeFacebook extends Facebook {
//
//}

class Instagram extends SosialMedia {
    final void login(String username, String password) {
        // isi method
    }
}

class FakeInstagram extends Instagram {
    // ERROR karena method sudah final (tidak bisa dioverride)
    // void login(String username, String password) {
        // isi method
    // }
}
