package com.plaps.androidcleancode.networking;


import com.plaps.androidcleancode.models.Person;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by ennur on 6/25/16.
 */
public interface NetworkService {

    @GET("test")
    Observable<List<Person>> getCityList();

}
