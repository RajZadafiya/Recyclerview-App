package com.example.newsfeedandroiddeveloper;

import android.content.Context;
import android.content.Entity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.newsfeedandroiddeveloper.databinding.NewsrecyclerBinding;

import java.net.URL;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.myviewholder>{
    ArrayList<News> newsArrayList;
    Context context;

    public CustomAdapter(ArrayList<News> newsArrayList, Context context) {
        this.newsArrayList = newsArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layout = LayoutInflater.from(parent.getContext());
        return new myviewholder(NewsrecyclerBinding.inflate(layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        try{

            final URL image_thumb_url = new URL(newsArrayList.get(position).img_thumb+"");
            Log.d("image_thumb_url",image_thumb_url+"");

            RequestOptions options = new RequestOptions().centerCrop().placeholder(R.mipmap.ic_launcher_round).error(R.mipmap.ic_launcher_round);
            Glide.with(context).load(image_thumb_url).apply(options).into(holder.binding.imgthumb);

            holder.binding.newsSource.setText(newsArrayList.get(position).news_source+"");
            holder.binding.newsTitle.setText(newsArrayList.get(position).news_title+"");
            holder.binding.newsDesc.setText(newsArrayList.get(position).news_desc+"");

            final URL image_source_logo_url = new URL(newsArrayList.get(position).news_source_logo+"");
            Log.d("image_source_logo_url",image_source_logo_url+"");

            Glide.with(context).load(image_source_logo_url).apply(options).into(holder.binding.newsSourceLogo);

            holder.binding.newsCategory.setText(newsArrayList.get(position).news_category+"");
            holder.binding.newsDate.setText(newsArrayList.get(position).news_date+"");




        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return newsArrayList.size();
    }

    public static class myviewholder extends RecyclerView.ViewHolder{
        NewsrecyclerBinding binding;

        myviewholder(NewsrecyclerBinding b){
            super(b.getRoot());
            binding = b;

        }
    }
}
