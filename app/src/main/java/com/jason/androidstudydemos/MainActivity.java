package com.jason.androidstudydemos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ImageView imageView;
    List<Msg> list = new ArrayList<>();
    int[] imgArr = {R.mipmap.profile1, R.mipmap.profile2,
            R.mipmap.profile3, R.mipmap.profile4,
            R.mipmap.profile5, R.mipmap.profile6,
            R.mipmap.profile7, R.mipmap.profile8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        imageView = findViewById(R.id.add_img);

        initData();

        BaseAdapter adapter = new MyBaseAdapter(this, list);

        listView.setAdapter(adapter);

        imageView.setOnClickListener(v -> {
            list.add(new Msg(R.mipmap.profile9, "虎正玺", "你好我好大家好", false));
            adapter.notifyDataSetChanged();
            listView.setTranscriptMode(AbsListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        });
    }

    private void initData() {
        for (int i = 1; i < 9; i++) {
            Msg msg = new Msg(imgArr[i - 1], "用户" + i, "说说" + i, i % 2 == 1);
            list.add(msg);
        }
    }
}