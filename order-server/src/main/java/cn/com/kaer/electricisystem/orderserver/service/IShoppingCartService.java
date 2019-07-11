package cn.com.kaer.electricisystem.orderserver.service;

import cn.com.kaer.electricisystem.orderserver.entity.ShoppingCartDTO;
import cn.com.kaer.electricitysystem.common.entity.SysResult;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
public interface IShoppingCartService {
    SysResult addShoppingCardService(ShoppingCartDTO shoppingCartDTO);
}
