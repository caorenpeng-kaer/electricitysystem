package cn.com.kaer.electricisystem.orderserver.controller;

import cn.com.kaer.electricisystem.orderserver.util.LockUtil;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caorenpeng
 * 2019/7/12
 */
@RestController
@RequestMapping(value = "/miaosha")
@Api(value = "秒杀", tags = "分布式锁的实战")
public class RedissonLockController {
    int stock = 2;
    @Autowired
    LockUtil lockUtil;

    @GetMapping(value = "/buy")
    @ApiOperation("抢购衣服")
    public SysResult buy() {
        String lockName = "clother";
        if (stock <= 0) {
            return SysResult.ok("商品数量为0了");
        } else {
            try {
                lockUtil.acquire(lockName);
                if (stock <= 0) {
                    return SysResult.ok("秒杀已经结束了");
                }
                stock--;
            } finally {
                lockUtil.realase(lockName);
            }
        }
        return SysResult.ok("秒杀成功");
    }

    @GetMapping(value = "/getStock")
    @ApiOperation("查询库存")
    public SysResult getStock() {
        return SysResult.ok(stock);
    }
}
