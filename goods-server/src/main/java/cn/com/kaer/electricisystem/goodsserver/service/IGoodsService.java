package cn.com.kaer.electricisystem.goodsserver.service;

import cn.com.kaer.electricisystem.goodsserver.entity.GoodsEntity;
import cn.com.kaer.electricitysystem.common.entity.SysResult;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
public interface IGoodsService {
    SysResult getGoodsByCategory(Integer categoryId);

    GoodsEntity getGoodsById(String goodsId);
}
