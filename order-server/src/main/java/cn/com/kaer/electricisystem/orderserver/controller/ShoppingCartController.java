package cn.com.kaer.electricisystem.orderserver.controller;

import cn.com.kaer.electricisystem.orderserver.entity.ShoppingCartDTO;
import cn.com.kaer.electricisystem.orderserver.service.IShoppingCartService;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@RestController
@RequestMapping(value = "/shoppingcart")
@Api(value = "购物车系列", tags = "购物车系列")
public class ShoppingCartController {
    private final static Logger logger = LoggerFactory.getLogger(ShoppingCartController.class);
    @Autowired
    private IShoppingCartService shoppingCartService;

    @PostMapping(value = "/addShoppingCart")
    @ApiOperation("加入购物车")
    public SysResult addShoppingCart(@RequestBody ShoppingCartDTO shoppingCart) {
        logger.info("【加入购物车接收参数:[shoppingCard:{}]】", shoppingCart.toString());
        return shoppingCartService.addShoppingCardService(shoppingCart);
    }
}
