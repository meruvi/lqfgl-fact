package com.laqfagal.fact.api;

import com.laqfagal.fact.request.LoginRequest;
import com.laqfagal.fact.response.DataResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

    @POST("api/v2/login")
    Call<DataResponse> login(@Body LoginRequest loginRequest);

    @GET("api/v2/tipo-documento")
    Call<DataResponse> getTipoDocumento();

}
