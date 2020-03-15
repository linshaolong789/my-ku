package com.example.myapplication201823;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StaggeredGridAdapter extends RecyclerView.Adapter<StaggeredGridAdapter.LinearViewHolder> {

    private Context mContext;


    String[] anythings = {"2020.2.27","2020.2.28","2020.3.1","2020.3.2","2020.3.3","2020.2.27","2020.2.28","2020.3.1","2020.3.2","2020.3.3",};
    int[] images = {R.drawable.bg_icon_waterball,R.drawable.bg_icon_for,R.drawable.bg_icon_hudie,R.drawable.bg_icon_waterballx,R.drawable.bg_icon_waterballxx,R.drawable.bg_icon_waterball,R.drawable.bg_icon_for,R.drawable.bg_icon_hudie,R.drawable.bg_icon_waterballx,R.drawable.bg_icon_waterballxx,};

    private LayoutInflater mLayoutInflater;
    public StaggeredGridAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public StaggeredGridAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_staggered_grid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredGridAdapter.LinearViewHolder holder, final int position) {
        holder.tv_anything.setText(anythings[position]);
        holder.imageView.setImageResource(images[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"序号"+position,Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView tv_anything;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.rv_fall);
            tv_anything = itemView.findViewById(R.id.rv_anything);
        }
    }
}
