package cn.com.kaer.electricisystem.goodsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GoodsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodsServerApplication.class, args);
	}

}
