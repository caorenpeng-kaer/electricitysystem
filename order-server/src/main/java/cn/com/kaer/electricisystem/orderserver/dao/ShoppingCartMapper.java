package cn.com.kaer.electricisystem.orderserver.dao;

import cn.com.kaer.electricisystem.orderserver.entity.ShoppingCartDTO;
import org.springframework.stereotype.Repository;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@Repository
public interface ShoppingCartMapper {
    int addShoppingCartInfo(ShoppingCartDTO shoppingCartDTO);

    ShoppingCartDTO getGoodsFromCartByIdAndGoodsId(ShoppingCartDTO shoppingCartDTO);

    int addQuantity(ShoppingCartDTO shoppingCartDTO);
}
