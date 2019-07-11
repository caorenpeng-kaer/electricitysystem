package cn.com.kaer.electricisystem.goodsserver.service.impl;

import cn.com.kaer.electricisystem.goodsserver.dao.GoodsMapper;
import cn.com.kaer.electricisystem.goodsserver.entity.GoodsEntity;
import cn.com.kaer.electricisystem.goodsserver.service.IGoodsService;
import cn.com.kaer.electricisystem.goodsserver.vo.GoodsVO;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import cn.com.kaer.electricitysystem.common.enums.ReturnMessage;
import cn.com.kaer.electricitysystem.common.exceptions.CommonException;
import org.apache.commons.lang3.StringUtils;
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

    @Override
    public GoodsEntity getGoodsById(String goodsId) {
        if (StringUtils.isEmpty(goodsId))
            throw new CommonException(ReturnMessage.PARAMS_IS_EMPTY);
        return mapper.getGoodsById(goodsId);
    }
}
