package Abstraction;

public class FaceBookAuth extends Auth {

    @Override
    public void register(String emailOrId, String newUsername, String newPassword) {

//        write the implementation to verify the email or Id

//        register the user
        this.username = newUsername;
        this.password = newPassword;
        System.out.println("You have successfully registered");
    }

    @Override
    public void forgotPassword(String emailOrIdOrUsername) {
        // write the own implementation
        System.out.println("forgot password");
    }

    @Override
    public boolean resetPassword(String username, String currentPassword, String newPassword) {
        // write the own implementation
        System.out.println("password reset");
        return true;

    }
}
