package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);

        Button btn1 = (Button) findViewById(R.id.exit);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ExittoMainActivity = new Intent(getApplicationContext(),MainActivity.class);
                ExittoMainActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                ExittoMainActivity.putExtra("EXIT",true);
                startActivity(ExittoMainActivity);
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });
    }
}

