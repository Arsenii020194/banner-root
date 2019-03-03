package com.banner.entity;

import com.util.crud.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.net.URL;

@Entity
@Table(name = "BANNER")
public class BannerEntity extends AbstractEntity<Long> implements Serializable {

    @Column(name = "IMG_SRC")
    private String imgSrc;

    @Column(name = "WIDTH")
    private Float width;

    @Column(name = "HEIGHT")
    private Float height;

    @Column(name = "TARGET_URL")
    private URL targetUrl;

    @Column(name = "LOCALE_ID")
    private Integer localeId;

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public URL getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(URL targetUrl) {
        this.targetUrl = targetUrl;
    }

    public Integer getLocaleId() {
        return localeId;
    }

    public void setLocaleId(Integer localeId) {
        this.localeId = localeId;
    }
}
