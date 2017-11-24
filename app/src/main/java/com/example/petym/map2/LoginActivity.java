package com.example.petym.map2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public final class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    public void onLoginClick(View view){
        Intent mapScreen = new Intent(this, MapsActivity.class);
        startActivity(mapScreen);
    }
}
