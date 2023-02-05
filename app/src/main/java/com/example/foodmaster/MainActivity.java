package com.example.foodmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tpage=findViewById(R.id.nextpage);

        tpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextpage();
            }
        });


    }

    private void nextpage() {
        finish();
        Intent intent =new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(intent);
    }
}