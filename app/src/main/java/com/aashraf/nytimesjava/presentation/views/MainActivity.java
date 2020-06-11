package com.aashraf.nytimesjava.presentation.views;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aashraf.nytimesjava.R;
import com.aashraf.nytimesjava.models.News;
import com.aashraf.nytimesjava.presentation.NYView;
import com.aashraf.nytimesjava.presentation.viewModel.NYViewModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public final class MainActivity extends AppCompatActivity implements NYView {
    private NYAdapter nyAdapter;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        NYViewModel viewModel = (new ViewModelProvider(this)).get(NYViewModel.class);
        viewModel.nyView = this;
        viewModel.getNyNews();
        this.initRecyclerView();
        this.initAdapter();
    }

    private final void initAdapter() {
        this.nyAdapter = new NYAdapter(this);
        RecyclerView recyclerView = this.findViewById(R.id.rv_ny_news);
        NYAdapter nyAdapter = this.nyAdapter;
        recyclerView.setAdapter(nyAdapter);
    }

    private final void initRecyclerView() {
        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager( this);
        RecyclerView recyclerView = this.findViewById(R.id.rv_ny_news);
        recyclerView.setLayoutManager(layoutManager);
        ((RecyclerView) this.findViewById(R.id.rv_ny_news)).setHasFixedSize(true);
    }

    public void setData(@NotNull List<News> list) {
        if (list !=null)
        nyAdapter.setNewsList(list);
    }
}