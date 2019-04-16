package com.example.adriana.dom_ukol3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
//filmy array list v mainactivity
        Filmy filmy = getIntent().getParcelableExtra("data");

        setTitle(filmy.name);


    }

}

