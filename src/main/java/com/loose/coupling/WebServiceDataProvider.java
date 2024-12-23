package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider{
    public String getUserDetails(){
        return "Fetching Data  from the Webservice";
    }

}
