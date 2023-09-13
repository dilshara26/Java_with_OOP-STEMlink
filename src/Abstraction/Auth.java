package Abstraction;
import java.util.Objects;

abstract public class Auth {
    public String username= null;
    public String password =null;

    public void login(String username, String password){
        if (Objects.equals(username, this.username) && Objects.equals(password, this.password)){
            System.out.println("Login is successful");
        }
        else {
            System.out.println("Invalid Login");
        }
    }

    abstract public void register(String emailOrId, String newUsername, String newPassword );

    abstract public  void forgotPassword(String emailOrIdOrUsername);

    abstract public  boolean resetPassword(String username, String currentPassword, String newPassword);


}
