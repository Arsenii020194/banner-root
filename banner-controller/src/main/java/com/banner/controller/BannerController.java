package com.banner.controller;

import com.banner.dto.BannerDto;
import com.banner.params.BannerParams;
import com.banner.service.BannerService;
import com.util.crud.controller.AbstractController;
import com.util.crud.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner")
public class BannerController extends AbstractController<BannerDto, BannerParams> {

    private BannerService bannerService;

    @Override
    public AbstractService<BannerDto, BannerParams> getService() {
        return bannerService;
    }

    @Autowired
    public void setBannerService(BannerService bannerService) {
        this.bannerService = bannerService;
    }
}