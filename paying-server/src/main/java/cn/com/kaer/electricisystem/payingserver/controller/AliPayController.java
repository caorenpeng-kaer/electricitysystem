package cn.com.kaer.electricisystem.payingserver.controller;

import cn.com.kaer.electricisystem.payingserver.service.IAlipayService;
import cn.com.kaer.electricitysystem.common.entity.SysResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Caorenpeng
 * 2019/7/17
 */
@RestController
@RequestMapping(value = "alipay")
@Api(value = "支付宝支付", tags = "支付宝支付")
public class AliPayController {
    @Autowired
    private IAlipayService alipayService;

    @GetMapping(value = "/pay")
    @ApiOperation("支付")
    public SysResult pay(HttpServletRequest request, HttpServletResponse response) {
        String result=null;
        try {
            result = alipayService.getPayRequest(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SysResult.ok(result);
    }

    @GetMapping(value = "/notifyUrl")
    public SysResult notifyUrl(HttpServletRequest request) {
        System.out.println(request);
        return SysResult.ok();
    }
}
