package com.sand_corporation.www.retrofitrxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.sand_corporation.www.retrofitrxjava.Adapter.CustomAdapter;
import com.sand_corporation.www.retrofitrxjava.GlobalVariable.Common;
import com.sand_corporation.www.retrofitrxjava.RestAPI.APIService;
import com.sand_corporation.www.retrofitrxjava.RestAPI.Model.Employee;
import com.sand_corporation.www.retrofitrxjava.RestAPI.Model.EmployeeList;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Button btnFetchData;
    private List<Employee> employeeList;
    private CustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        btnFetchData = findViewById(R.id.btnFetchData);

        btnFetchData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadJsonFromServer();
            }
        });
    }

    public void loadJsonFromServer(){
        APIService apiService = Common.getRetrofitClient();
        Observable<EmployeeList> observable = apiService.getEmployeeList()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
        observable.subscribe(new Observer<EmployeeList>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(EmployeeList value) {
                employeeList = new ArrayList<>();
                List<Employee> employees = value.getEmployeeList();
                for (int i =0; i <employees.size(); i++){
                    Employee employee = new Employee();
                    employee.setFirstName(employees.get(i).getFirstName());
                    employee.setLastName(employees.get(i).getLastName());
                    employeeList.add(employee);
                }

                mAdapter = new CustomAdapter(employeeList,MainActivity.this);
                listView.setAdapter(mAdapter);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
