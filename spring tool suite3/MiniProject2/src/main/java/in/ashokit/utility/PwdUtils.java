package in.ashokit.utility;

import org.apache.commons.lang3.RandomStringUtils;

public class PwdUtils {
  
    public static String generateRandomPwd(int length) {
        // Define the characters that can be used in the password
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        
        // Generate the random password
        return RandomStringUtils.random(length, characters);
    }

    public static void main(String[] args) {
        // Example usage
        String randomPassword = generateRandomPwd(12);
        System.out.println("Generated Random Password: " + randomPassword);
    }
}
