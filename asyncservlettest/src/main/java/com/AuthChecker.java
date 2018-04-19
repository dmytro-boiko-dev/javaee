package com;

public class AuthChecker {
    public static boolean loginCorrect(String user, String pass){
        return user.contentEquals("root") && pass.contentEquals("root");
    }
}
