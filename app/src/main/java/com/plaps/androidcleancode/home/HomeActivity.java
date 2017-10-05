package com.plaps.androidcleancode.home;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import com.plaps.androidcleancode.BaseApp;
import com.plaps.androidcleancode.R;
import com.plaps.androidcleancode.models.Person;
import com.plaps.androidcleancode.networking.Service;

import java.util.List;

import javax.inject.Inject;

public class HomeActivity extends BaseApp implements HomeView, HomeAdapter.OnItemClickListener {

    private RecyclerView list;
    @Inject
    public  Service service;
    ProgressBar progressBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDeps().inject(this);

        renderView();
        init();

        HomePresenter presenter = new HomePresenter(service, this);
        presenter.getCityList();
    }

    public  void renderView(){
        setContentView(R.layout.activity_home);
        list = (RecyclerView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
    }

    public void init(){
        list.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void showWait() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void removeWait() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onFailure(String appErrorMessage) {

    }

    @Override
    public void getityListSuccess(List<Person> personList) {

        HomeAdapter adapter = new HomeAdapter(getApplicationContext(), personList, this);


        list.setAdapter(adapter);
    }


    @Override
    public void onClick(Person Item) {

    }
}
