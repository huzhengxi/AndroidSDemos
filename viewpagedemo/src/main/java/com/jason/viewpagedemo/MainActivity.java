package com.jason.viewpagedemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> pics = new ArrayList<>();
    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pics.add(R.mipmap.bg1);
        pics.add(R.mipmap.bg2);
        pics.add(R.mipmap.bg3);
        pics.add(R.mipmap.bg4);


        viewPager2 = findViewById(R.id.view_page);

        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item, parent, false);


                return new ViewHolder(view);
            }


            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                ViewHolder viewHolder = (ViewHolder) holder;
                viewHolder.container.setBackgroundResource(pics.get(position));
            }

            @Override
            public int getItemCount() {
                return pics.size();
            }
        };

        viewPager2.setAdapter(adapter);
    }

    private static class ViewHolder extends RecyclerView.ViewHolder {

        public LinearLayout container;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.container = itemView.findViewById(R.id.container);
        }

    }
}