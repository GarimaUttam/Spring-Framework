package com.loose.coupling;

import com.tight.coupling.UserDatabase;

public class UserDatabaseProvider implements UserDataProvider  {

    public String getUserDetails(){
        return "User details from database";

    }

}
