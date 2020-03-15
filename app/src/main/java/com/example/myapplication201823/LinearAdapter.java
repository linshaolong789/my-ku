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

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder> {

    private Context mContext;
    String[] times = {"2020.2.27","2020.2.28","2020.3.1","2020.3.2","2020.3.3"};
    String[] things ={"小宝贝1","小宝贝2","小宝贝3","小宝贝4","小宝贝5"};
    int[] images = {R.drawable.bg_icon_waterball,R.drawable.bg_icon_for,R.drawable.bg_icon_hudie,R.drawable.bg_icon_waterballx,R.drawable.bg_icon_waterballxx};


    private LayoutInflater mLayoutInflater;
    public LinearAdapter(Context context){
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder holder, final int position) {
        holder.tv_time.setText(times[position]);
        holder.tv_things.setText(things[position]);
        holder.image.setImageResource(images[position]);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,"序号"+position,Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView tv_time;
        private TextView tv_things;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_store);
            tv_time = itemView.findViewById(R.id.tv_time);
            tv_things = itemView.findViewById(R.id.tv_things);
        }
    }
}
