
package com.aashraf.nytimesjava.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @Expose
    private String copyright;

    @SerializedName("num_results")
    private Long numResults;

    @SerializedName("results")
    private List<News> news;

    @Expose
    private String status;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Long getNumResults() {
        return numResults;
    }

    public void setNumResults(Long numResults) {
        this.numResults = numResults;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
