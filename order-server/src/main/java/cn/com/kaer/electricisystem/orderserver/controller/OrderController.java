package cn.com.kaer.electricisystem.orderserver.controller;

import cn.com.kaer.electricisystem.orderserver.entity.ShoppingCartDTO;
import cn.com.kaer.electricisystem.orderserver.service.client.IGoodsClient;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@RestController
@RequestMapping(value = "/order")
@Api(value = "订单相关", tags = "订单相关")
public class OrderController {
    private final static Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private IGoodsClient goodsClient;

    @PostMapping(value = "/placeOrder")
    @ApiOperation("下单操作")
    public SysResult placeOrder() {
        //参数接收List<Object>  Object:商品ID、数量
        //1.查询商品
        //2.校验库存
        //3.减库存操作
        //4.创建订单
        //5.下单成功
        return SysResult.ok();
    }

    @GetMapping(value = "/getGoods")
    public SysResult getGoods() {
        return SysResult.ok(goodsClient.getGoodsById("a5e60157f4b917cc"));
    }

}
