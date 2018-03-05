package com.example.w.kalkulatorspalania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Kalkulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
    }
    public void click_first(View imageButton)
    {
        startActivity( new Intent(Kalkulator.this, spal_100_km.class));
    }
    public void click_second(View imageButton2)
    {
        Intent next= new Intent(Kalkulator.this,koszt.class);
        startActivity(next);
    }
}
