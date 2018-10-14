package com.sand_corporation.www.retrofitrxjava.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.sand_corporation.www.retrofitrxjava.R;
import com.sand_corporation.www.retrofitrxjava.RestAPI.Model.Employee;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<Employee> employeeList;
    private LayoutInflater layoutInflater;

    @Override
    public int getCount() {
        return employeeList.size();
    }

    @Override
    public Object getItem(int position) {
        return employeeList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.single_employee,parent,false);

        }
        return null;
    }
}
