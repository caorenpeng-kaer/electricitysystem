package cn.com.kaer.electricisystem.orderserver.service.client;

import cn.com.kaer.electricisystem.orderserver.entity.client.GoodsEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Caorenpeng
 * 2019/7/11
 */
@FeignClient(value = "goods")
public interface IGoodsClient {
    @GetMapping(value = "/goodsclient/getGoods")
    GoodsEntity getGoodsById(@RequestParam("goodsId") String goodsId);
}
