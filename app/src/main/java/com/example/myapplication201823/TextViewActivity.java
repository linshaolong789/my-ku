package com.example.myapplication201823;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class TextViewActivity extends AppCompatActivity {

//    private TextView mTv4;
//    private TextView mTv5;

    private Button mBtnEdTe2;
    private ImageView mTv111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
//        mTv4 = findViewById(R.id.tv_4);
//        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
//        mTv4.getPaint().setAntiAlias(true);
//        mTv5 = findViewById(R.id.tv_5);
//        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        mTv111 = findViewById(R.id.iv_111);
        Glide.with(this).load("https://img.ivsky.com/img/bizhi/pre/201512/06/danboard-012.jpg").into(mTv111);

        mBtnEdTe2 = findViewById(R.id.btn_EditText2);
        mBtnEdTe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TextViewActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
    }
}
