package com.example.myapplication201823;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtnAnNiu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnAnNiu = findViewById(R.id.btn_AnNiu);
        mBtnAnNiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Thanks,you are great",Toast.LENGTH_SHORT).show();
            }
        }
        );
    }
}
