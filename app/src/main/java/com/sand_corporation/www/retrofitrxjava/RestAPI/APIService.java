package com.sand_corporation.www.retrofitrxjava.RestAPI;

import com.sand_corporation.www.retrofitrxjava.RestAPI.Model.EmployeeList;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface APIService {

    @GET("/employee.json")
    Observable<EmployeeList> getEmployeeList();

}
