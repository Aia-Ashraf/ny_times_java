package com.aashraf.nytimesjava.presentation.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.aashraf.nytimesjava.R;
import com.aashraf.nytimesjava.models.News;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NYAdapter extends RecyclerView.Adapter<NYAdapter.NyViewHolder> {
    private List<News> newsList;
    private Context context;

    public NYAdapter(Context context) {
        this.context=context;
    }
    public final void setNewsList(@NotNull List<News> list) {
        this.newsList = list;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context = parent.getContext();

        View view = LayoutInflater.from(context).inflate(R.layout.item_ny, parent, false);
        return new NyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NyViewHolder holder, int position) {
        final News mPosition = newsList.get(position);
        holder.itemView.setOnClickListener((View.OnClickListener) (new View.OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("title", mPosition.getTitle());
                intent.putExtra("des", mPosition.getAbstract());
                ContextCompat.startActivity(context, intent, Bundle.EMPTY);
            }
        }));
        holder.txtNyNewsTitle.setText(mPosition.getTitle());
        holder.txtNyNewsAuther.setText(mPosition.getByline());
        holder.txtDate.setText(mPosition.getPublishedDate());
    }


    @Override
    public int getItemCount() {
        if (newsList != null) {
            return newsList.size();
        } else
            return 0;
    }


    class NyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtNyNewsTitle;
        public TextView txtNyNewsAuther;
        public TextView txtDate;
        public ImageView ibForward;

        public NyViewHolder(View itemView) {
            super(itemView);
            ibForward = itemView.findViewById(R.id.ib_forward_arrow);
            txtNyNewsTitle = itemView.findViewById(R.id.tv_ny_title);
            txtNyNewsAuther = itemView.findViewById(R.id.tv_ny_auther);
            txtDate = itemView.findViewById(R.id.tv_date);
        }
    }
}