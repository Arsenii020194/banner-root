package com.banner.params;

import com.util.crud.params.AbstractParams;
import com.util.crud.params.Cause;
import com.util.crud.params.QueryParam;

import java.net.URL;

public class BannerParams extends AbstractParams {

    private String imgSrc;

    private Float width;

    @QueryParam(cause = Cause.MORE_EQ, column = "height")
    private Float heightFrom;

    @QueryParam(cause = Cause.LESS_EQ, column = "height")
    private Float heightTo;

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

    public Float getHeightFrom() {
        return heightFrom;
    }

    public void setHeightFrom(Float heightFrom) {
        this.heightFrom = heightFrom;
    }

    public Float getHeightTo() {
        return heightTo;
    }

    public void setHeightTo(Float heightTo) {
        this.heightTo = heightTo;
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
