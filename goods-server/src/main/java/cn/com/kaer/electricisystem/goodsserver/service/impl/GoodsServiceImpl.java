package cn.com.kaer.electricisystem.goodsserver.service.impl;

import cn.com.kaer.electricisystem.goodsserver.dao.GoodsMapper;
import cn.com.kaer.electricisystem.goodsserver.service.IGoodsService;
import cn.com.kaer.electricisystem.goodsserver.vo.GoodsVO;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Service
public class GoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsMapper mapper;

    @Override
    public SysResult getGoodsByCategory(Integer categoryId) {
        List<GoodsVO> goodsVOList = mapper.getGoodsByCategoryId(categoryId);
        return SysResult.ok(goodsVOList);
    }
}
