package com.banner.dao.impl;

import com.banner.dao.BannerDao;
import com.banner.entity.BannerEntity;
import com.banner.params.BannerParams;
import com.util.crud.dao.impl.AbstractDaoImpl;
import org.springframework.stereotype.Repository;

@Repository
public class BannerDaoImpl extends AbstractDaoImpl<BannerEntity, BannerParams> implements BannerDao {
}
