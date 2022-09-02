package pl.sda.bcrypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptMain {

    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        System.out.println(encoder.encode("haslo"));

        String encodedPassword = "$2a$10$unbWgjSq3oNci9ZecXVooO5I07fyfMnMij35a4DLRcCyKa3gPcwvq";

        System.out.println(encoder.matches("haslo", encodedPassword));

    }

}

