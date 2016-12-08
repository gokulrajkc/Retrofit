package com.example.gokulrajkumar.github;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by gokulrajkumar on 05/11/16.
 */

public interface MyApiEndPointInterface {

    @GET("contacts/")
    Call<User> getHiveDetails();

}
