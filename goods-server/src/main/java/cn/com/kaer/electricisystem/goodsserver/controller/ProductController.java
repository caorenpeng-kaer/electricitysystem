package cn.com.kaer.electricisystem.goodsserver.controller;

import cn.com.kaer.electricisystem.goodsserver.service.IGoodsService;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@RestController
@RequestMapping(value = "/product")
@Api(value = "商品", tags = "商品")
public class ProductController {
    @Autowired
    private IGoodsService goodsService;

    @GetMapping(value = "/getGoods")
    @ApiOperation("查询所有商品")
    public SysResult getGoods(@RequestParam("categoryId") Integer categoryId) {
        return goodsService.getGoodsByCategory(categoryId);
    }
}
