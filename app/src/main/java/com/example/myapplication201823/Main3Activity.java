package com.example.myapplication201823;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {
    private Button mBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mBtn3 = findViewById(R.id.btn_3);
        mBtn3.setOnClickListener(new View.OnClickListener(){

            @Override
    public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,WaterfallActivity.class);
                startActivity(intent);
                Toast.makeText(Main3Activity.this,"Enjoy the next trip",Toast.LENGTH_SHORT).show();
            }
        }
        );
    }
}
