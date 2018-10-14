package com.sand_corporation.www.retrofitrxjava.RestAPI.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("First_Name")
    @Expose
    private String firstName;

    @SerializedName("Last_Name")
    @Expose
    private String lastName;

    public Employee() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
