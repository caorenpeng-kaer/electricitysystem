package cn.com.kaer.electricisystem.payingserver.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Caorenpeng
 * 2019/7/17
 */
@Configuration
@ConfigurationProperties(prefix = "alibaba")
@Data
public class AliPayConfig {
    private String appId;
    //支付宝公钥
    private String alipayPublicKey;
    //商户si'yao
    private String privateKey;
}
