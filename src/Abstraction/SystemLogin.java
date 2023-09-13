package Abstraction;

public class SystemLogin {
    public static void main(String[] args){
        FaceBookAuth dilsharaAuth = new FaceBookAuth();
        dilsharaAuth.register("dila@gmail.com", "dila","123");
        dilsharaAuth.login("dila","123");

        System.out.println("Login of user 2");
        FaceBookAuth udaraAuth = new FaceBookAuth();
        udaraAuth.login("dila", "123");
    }
}
