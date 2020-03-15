package com.example.myapplication201823;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Main5Activity extends AppCompatActivity {
    private Button mBtn5;
    private RecyclerView mRvHor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        mRvHor = findViewById(R.id.rv_hor);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Main5Activity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRvHor.setLayoutManager(linearLayoutManager);
        mRvHor.addItemDecoration(new Main5Activity.MyDecoration());
        mRvHor.setAdapter(new HorAdapter(Main5Activity.this));

        mBtn5 = findViewById(R.id.btn_5);
        mBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main5Activity.this, GridRecyclerViewActivity.class);
                startActivity(intent);
                Toast.makeText(Main5Activity.this,"Relax and enjoy nature",Toast.LENGTH_SHORT).show();
            }
        }
        );
    }
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHer),0);
        }
    }
}
