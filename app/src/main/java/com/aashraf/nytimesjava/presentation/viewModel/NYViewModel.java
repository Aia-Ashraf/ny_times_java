package com.aashraf.nytimesjava.presentation.viewModel;

import androidx.lifecycle.ViewModel;

import com.aashraf.nytimesjava.domain.Repo;
import com.aashraf.nytimesjava.models.News;
import com.aashraf.nytimesjava.presentation.NYView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import io.reactivex.rxjava3.disposables.CompositeDisposable;


public final class NYViewModel extends ViewModel {
    private List<News> newsList;
    @NotNull
    public NYView nyView;
    Repo repo;

    public final void getNyNews() {
        repo = new Repo(newsList, nyView);
        repo.getdata();
    }
}
