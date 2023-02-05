package com.example.foodmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button tpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    tpage=findViewById(R.id.nextpage1);

        tpage.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            nextpage();
        }
    });



}
    private void nextpage() {
        finish();
        Intent intent =new Intent(getApplicationContext(),Home1Activity.class);
        startActivity(intent);
    }
    
}