package cn.com.kaer.electricisystem.goodsserver.controller;

import cn.com.kaer.electricisystem.goodsserver.service.IGoodsService;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import cn.com.kaer.electricitysystem.common.exceptions.CommonException;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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


    @GetMapping(value = "/test")
    public SysResult test() {
        Strings.isNullOrEmpty("");
        List<String> a = new ArrayList<>();
        a.add(null);
        a.get(0).equals("dasdas");
        return SysResult.ok();
    }

    public static void main(String[] args) {
        List<String> lists = Lists.newArrayList();
        Map<String, Object> maps = Maps.newHashMap();
        boolean result = Strings.isNullOrEmpty(null);
        System.out.println(result);
    }
}
