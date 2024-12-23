package com.tight.coupling;

import java.security.PrivateKey;

public class TightCouplingExample {
    public static void main(String[] args){
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
