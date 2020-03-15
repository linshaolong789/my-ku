package com.example.myapplication201823;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class WaterfallActivity extends AppCompatActivity {

    private Button mBtn6;
    private RecyclerView mRvWater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterfall);
        mRvWater = findViewById(R.id.rv_water);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        mRvWater.setLayoutManager(layoutManager);
        mRvWater.addItemDecoration(new MyDecoration());
        mRvWater.setAdapter(new StaggeredGridAdapter(WaterfallActivity.this));

        mBtn6 = findViewById(R.id.btn_6);
        mBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WaterfallActivity.this,Main4Activity.class);
                startActivity(intent);
                Toast.makeText(WaterfallActivity.this,"Enjoy the next trip",Toast.LENGTH_SHORT).show();
            }
        }
        );
    }
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelSize(R.dimen.dividerHer3);
            outRect.set(gap,gap,gap,gap);
        }
    }
}
