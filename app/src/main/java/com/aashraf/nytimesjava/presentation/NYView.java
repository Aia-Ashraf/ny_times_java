package com.aashraf.nytimesjava.presentation;


import com.aashraf.nytimesjava.models.News;

import java.util.List;

public interface NYView {
    void setData( List<News> newsList);
}
