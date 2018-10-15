package com.sand_corporation.www.retrofitrxjava.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sand_corporation.www.retrofitrxjava.R;
import com.sand_corporation.www.retrofitrxjava.RestAPI.Model.Employee;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private List<Employee> employeeList;
    private Context mContext;
    private LayoutInflater layoutInflater;

    public CustomAdapter(List<Employee> employeeList, Context mContext) {
        this.employeeList = employeeList;
        this.mContext = mContext;
        layoutInflater = LayoutInflater.from(mContext);
    }

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
        //Inflate the view to the screen
        MyViewHolder holder;
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.single_employee,parent,false);
            holder = new MyViewHolder();
            holder.txtFirstName = convertView.findViewById(R.id.txtFirstName);
            holder.txtLastName = convertView.findViewById(R.id.txtLastName);
            convertView.setTag(holder);
        } else {
            holder = (MyViewHolder) convertView.getTag();
        }

        //Set the value in views
        Employee employee = (Employee) getItem(position);
        holder.txtFirstName.setText(employee.getFirstName());
        holder.txtLastName.setText(employee.getLastName());

        return convertView;
    }

    class MyViewHolder{
        private TextView txtFirstName, txtLastName;
    }
}
