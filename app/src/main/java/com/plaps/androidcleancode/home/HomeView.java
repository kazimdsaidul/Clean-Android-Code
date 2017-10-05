package com.plaps.androidcleancode.home;

import com.plaps.androidcleancode.models.Person;

import java.util.List;

/**
 * Created by ennur on 6/25/16.
 */
public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getityListSuccess(List<Person> cityListResponse);

}
