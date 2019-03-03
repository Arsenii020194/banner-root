package com.banner.dto;

import com.util.crud.dto.AbstractDto;

import java.net.URL;

public class BannerDto extends AbstractDto {

    private String imgSrc;
    private Float width;
    private Float height;
    private URL targetUrl;
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
