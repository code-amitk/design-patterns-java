package org.example.patterns.builder;

public class ClientBuilder {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                    .setName("Gajju")
                    .setEmailId("gajju420@gmail")
                    .setPhoneNum(12345)
                    .build();

        System.out.println(user);
    }
}
