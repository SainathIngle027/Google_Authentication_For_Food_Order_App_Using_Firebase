package com.example.foodmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home1Activity extends AppCompatActivity {

    Button tpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home1);

        tpage = findViewById(R.id.nextpage2);

        tpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextpagg();
            }
        });
    }
    private void nextpagg()
    {
        finish();
        Intent intent =new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }

}