package cn.com.kaer.electricisystem.payingserver.service.impl;

import cn.com.kaer.electricisystem.payingserver.configuration.AliPayConfig;
import cn.com.kaer.electricisystem.payingserver.service.IAlipayService;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayMobilePublicMultiMediaClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.alipay.api.AlipayConstants.CHARSET;

/**
 * Created by Caorenpeng
 * 2019/7/17
 */
@Service
public class AlipayServiceImpl implements IAlipayService {
    @Autowired
    private AliPayConfig config;

    @Override
    public String getPayRequest(HttpServletRequest httpRequest,
                              HttpServletResponse httpResponse) throws ServletException, IOException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do", config.getAppId(), config.getPrivateKey(), "json", "utf-8", config.getAlipayPublicKey(), "RSA2"); //获得初始化的AlipayClient
        AlipayTradeAppPayRequest alipayRequest = new AlipayTradeAppPayRequest();//创建API对应的request
        alipayRequest.setNotifyUrl("http://kaer.free.idcfengye.com/alipay/notifyUrl");//在公共参数中设置回跳和通知地址
        JSONObject content = new JSONObject();
        content.put("out_trade_no", "20150320010101002");
        content.put("total_amount", "88.88");
        content.put("subject", "Iphone XS 128G");
        content.put("product_code", "QUICK_WAP_PAY");
        alipayRequest.setBizContent(content.toJSONString());//填充业务参数
        AlipayTradeAppPayResponse form = null;
        try {
            form = alipayClient.sdkExecute(alipayRequest); //调用SDK生成表单
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return form.getParams().toString();
    }

    public static void main(String[] args) {
        JSONObject js = new JSONObject();
        js.put("asdas", "dasdas");
        System.out.println(js.toString());
        System.out.println(js.toJSONString());
    }
}
