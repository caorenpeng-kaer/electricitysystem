package cn.com.kaer.electricisystem.orderserver.controller;

import cn.com.kaer.electricisystem.orderserver.entity.ShoppingCartDTO;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@RestController
@RequestMapping(value = "/order")
@Api(value = "订单相关", tags = "订单相关")
public class OrderController {
    private final static Logger logger = LoggerFactory.getLogger(OrderController.class);

    @PostMapping(value = "/placeOrder")
    @ApiOperation("下单操作")
    public SysResult placeOrder(@RequestBody ShoppingCartDTO shoppingCart) {
        logger.info("【】");
        return SysResult.ok();
    }

}
