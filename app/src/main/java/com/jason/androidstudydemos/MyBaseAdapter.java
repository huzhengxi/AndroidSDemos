package com.jason.androidstudydemos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyBaseAdapter extends BaseAdapter {
    private Context context;
    private List<Msg> list;

    public MyBaseAdapter(Context context, List<Msg> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_view_item, null);
            viewHolder = new ViewHolder();
            convertView.setTag(viewHolder);
            viewHolder.profile = convertView.findViewById(R.id.profile);
            viewHolder.nickname = convertView.findViewById(R.id.nickname);
            viewHolder.content = convertView.findViewById(R.id.content);
            viewHolder.like = convertView.findViewById(R.id.like);
            viewHolder.comment = convertView.findViewById(R.id.comment);
            viewHolder.repost = convertView.findViewById(R.id.repost);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Msg msg = list.get(position);

        viewHolder.profile.setImageResource(msg.getProfile());

        viewHolder.nickname.setText(msg.getNickname());

        viewHolder.content.setText(msg.getContent());

        if (msg.isLike()) {
            viewHolder.like.setImageResource(R.mipmap.liked);
        } else {
            viewHolder.like.setImageResource(R.mipmap.like);
        }

        viewHolder.comment.setOnClickListener(v -> {
            Toast.makeText(context, "您点击了评论", Toast.LENGTH_SHORT).show();
        });
        viewHolder.repost.setOnClickListener(v -> {
            Toast.makeText(context, "您点击转发", Toast.LENGTH_SHORT).show();
        });

        return convertView;
    }

    private static class ViewHolder {
        public ImageView profile, like, comment, repost;
        public TextView nickname, content;
    }
}

