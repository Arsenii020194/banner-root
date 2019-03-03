package com.banner.service.impl;

import com.banner.dao.BannerDao;
import com.banner.dto.BannerDto;
import com.banner.entity.BannerEntity;
import com.banner.params.BannerParams;
import com.banner.service.BannerService;
import com.util.crud.dao.AbstractDao;
import com.util.crud.service.impl.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerServiceImpl extends AbstractServiceImpl<BannerDto, BannerParams> implements BannerService {

    private BannerDao bannerDao;

    @Override
    public AbstractDao<BannerEntity, BannerParams> getDao() {
        return bannerDao;
    }

    @Autowired
    public void setBannerDao(BannerDao bannerDao) {
        this.bannerDao = bannerDao;
    }
}
