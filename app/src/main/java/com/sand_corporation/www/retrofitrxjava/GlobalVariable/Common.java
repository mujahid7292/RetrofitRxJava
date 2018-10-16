package com.sand_corporation.www.retrofitrxjava.GlobalVariable;

import com.sand_corporation.www.retrofitrxjava.RestAPI.APIService;
import com.sand_corporation.www.retrofitrxjava.RestAPI.RetrofitClient;

public class Common {

    private static final String BASE_URL = "http://192.168.99.106:3000/";

    public static APIService getRetrofitClient(){
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
