package cn.com.kaer.electricisystem.payingserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "cn.com.kaer")
@EnableDiscoveryClient
@MapperScan(value ={"cn.com.kaer.electricisystem.payingserver.dao"})
public class PayingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayingServerApplication.class, args);
	}

}
