package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    String sUrl = "http://epanchal.com/myjobgalaxyservice.asmx/";
    String api = "getUserList";

    LoginResponse loginResponse;

    List<Table> tableList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                AndroidNetworking.get(sUrl + api)
                        .addQueryParameter("plngUserId", "0")
                        .addQueryParameter("pstringMobileNo", "")
                        .addQueryParameter("pstrPassword", "")
                        .setTag("test")
                        .setPriority(Priority.IMMEDIATE)
                        .build()
                        .getAsJSONObject(new JSONObjectRequestListener() {
                            @Override
                            public void onResponse(JSONObject response) {

                                loginResponse = new Gson().fromJson(response.toString(), LoginResponse.class);

                                tableList =  loginResponse.getTable();

                                Log.d("Data", "" + tableList.get(0).getEntityName());

                            }

                            @Override
                            public void onError(ANError anError) {
                                Log.d("Data", "" + anError);
                            }
                        });


            }
        });
    }
}
