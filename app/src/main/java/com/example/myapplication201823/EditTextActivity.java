package com.example.myapplication201823;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditTextActivity extends AppCompatActivity {
    private Button mBtnLogin;
    private EditText mEtName;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        mBtnLogin = findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditTextActivity.this,Main3Activity.class);
                startActivity(intent);
                Toast.makeText(EditTextActivity.this,"登录成功！",Toast.LENGTH_SHORT).show();
            }
        });
        mEtName = findViewById(R.id.et_1);
        mEtName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("edittext", charSequence.toString());
            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }
}
