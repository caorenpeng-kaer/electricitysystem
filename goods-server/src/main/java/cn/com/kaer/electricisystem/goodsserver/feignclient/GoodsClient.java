package cn.com.kaer.electricisystem.goodsserver.feignclient;

import cn.com.kaer.electricisystem.goodsserver.entity.GoodsEntity;
import cn.com.kaer.electricisystem.goodsserver.service.IGoodsService;
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
@RequestMapping(value = "/goodsclient")
public class GoodsClient {
    @Autowired
    private IGoodsService goodsService;

    /**
     * <h2>对外提供查询某商品详情的功能</h2>
     * @param goodsId
     * @return
     */
    @GetMapping(value = "/getGoods")
    public GoodsEntity getGoods(@RequestParam("goodsId") String goodsId) {
        return goodsService.getGoodsById(goodsId);
    }
}
