package Abstraction;

public class AppleAuth  extends Auth{


    @Override
    public void register(String emailOrId, String newUsername, String newPassword) {

    }

    @Override
    public void forgotPassword(String emailOrIdOrUsername) {

    }

    @Override
    public boolean resetPassword(String username, String currentPassword, String newPassword) {
//        write the own implementation
        return false;
    }
}
