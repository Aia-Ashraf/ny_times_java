
package com.aashraf.nytimesjava.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class News {

    @SerializedName("abstract")
    private String desc;
    @SerializedName("adx_keywords")
    private String adxKeywords;
    @SerializedName("asset_id")
    private Long assetId;
    @Expose
    private String byline;
    @Expose
    private Object column;
    @SerializedName("des_facet")
    private List<String> desFacet;
    @SerializedName("eta_id")
    private Long etaId;
    @SerializedName("geo_facet")
    private List<String> geoFacet;
    @Expose
    private Long id;
    @Expose
    private List<Object> media;
    @Expose
    private String nytdsection;
    @SerializedName("org_facet")
    private List<String> orgFacet;
    @SerializedName("per_facet")
    private List<String> perFacet;
    @SerializedName("published_date")
    private String publishedDate;
    @Expose
    private String section;
    @Expose
    private String source;
    @Expose
    private String subsection;
    @Expose
    private String title;
    @Expose
    private String type;
    @Expose
    private String updated;
    @Expose
    private String uri;
    @Expose
    private String url;

    public String getAbstract() {
        return desc;
    }

    public void setAbstract(String desc) {
        this.desc = desc;
    }

    public String getAdxKeywords() {
        return adxKeywords;
    }

    public void setAdxKeywords(String adxKeywords) {
        this.adxKeywords = adxKeywords;
    }

    public Long getAssetId() {
        return assetId;
    }

    public void setAssetId(Long assetId) {
        this.assetId = assetId;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public Object getColumn() {
        return column;
    }

    public void setColumn(Object column) {
        this.column = column;
    }

    public List<String> getDesFacet() {
        return desFacet;
    }

    public void setDesFacet(List<String> desFacet) {
        this.desFacet = desFacet;
    }

    public Long getEtaId() {
        return etaId;
    }

    public void setEtaId(Long etaId) {
        this.etaId = etaId;
    }

    public List<String> getGeoFacet() {
        return geoFacet;
    }

    public void setGeoFacet(List<String> geoFacet) {
        this.geoFacet = geoFacet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Object> getMedia() {
        return media;
    }

    public void setMedia(List<Object> media) {
        this.media = media;
    }

    public String getNytdsection() {
        return nytdsection;
    }

    public void setNytdsection(String nytdsection) {
        this.nytdsection = nytdsection;
    }

    public List<String> getOrgFacet() {
        return orgFacet;
    }

    public void setOrgFacet(List<String> orgFacet) {
        this.orgFacet = orgFacet;
    }

    public List<String> getPerFacet() {
        return perFacet;
    }

    public void setPerFacet(List<String> perFacet) {
        this.perFacet = perFacet;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
