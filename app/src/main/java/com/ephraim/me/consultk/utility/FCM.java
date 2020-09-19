package com.ephraim.me.consultk.utility;



import com.ephraim.me.consultk.models.fcm.FirebaseCloudMessage;
import com.squareup.okhttp.ResponseBody;

import java.util.Map;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/**
 * Created by User on 10/26/2017.
 */

public interface FCM {

    @POST("send")
    Call<ResponseBody> send(
            @HeaderMap Map<String, String> headers,
            @Body FirebaseCloudMessage message
    );
}
