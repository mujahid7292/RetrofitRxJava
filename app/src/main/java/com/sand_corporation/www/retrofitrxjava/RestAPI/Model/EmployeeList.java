package com.sand_corporation.www.retrofitrxjava.RestAPI.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeeList {


    @SerializedName("Employee_List")
    @Expose
    private List<Employee> employeeList = null;

    public EmployeeList() {

    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
