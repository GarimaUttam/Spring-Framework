package com.ioc.coupling;

public class UserDatabaseProvider implements UserDataProvider {

    public String getUserDetails(){
        return "User details from database";

    }

}
