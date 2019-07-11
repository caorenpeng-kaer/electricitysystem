package cn.com.kaer.electricisystem.orderserver.service.impl;

import cn.com.kaer.electricisystem.orderserver.dao.ShoppingCartMapper;
import cn.com.kaer.electricisystem.orderserver.entity.ShoppingCartDTO;
import cn.com.kaer.electricisystem.orderserver.service.IShoppingCartService;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import cn.com.kaer.electricitysystem.common.enums.ReturnMessage;
import cn.com.kaer.electricitysystem.common.exceptions.CommonException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Service
public class ShoppingCartServiceImpl implements IShoppingCartService {
    private final static Logger logger = LoggerFactory.getLogger(ShoppingCartServiceImpl.class);
    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public SysResult addShoppingCardService(ShoppingCartDTO shoppingCartDTO) {
        if (!shoppingCartDTO.checkParam())
            throw new CommonException(ReturnMessage.PARAMS_IS_EMPTY);
        shoppingCartDTO.setUserId("crp");
        int result;
        //1.查询是否有添加过购物车
        ShoppingCartDTO isAdd = shoppingCartMapper.getGoodsFromCartByIdAndGoodsId(shoppingCartDTO);
        if (null == isAdd) {
            //2.如果是新商品直接添加
            logger.info("【添加新商品】");
            result = shoppingCartMapper.addShoppingCartInfo(shoppingCartDTO);
        } else {
            //3.否则在原有基础上加数量
            logger.info("增加原有商品数量");
            result = shoppingCartMapper.addQuantity(shoppingCartDTO);
        }
        return result > 0 ? SysResult.ok(1) : SysResult.ok(0);
    }
}
