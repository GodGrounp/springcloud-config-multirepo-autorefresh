package pri.holysu.test.springcloudconfigautorefreshserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class SpringcloudConfigAutorefreshServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigAutorefreshServerApplication.class, args);
	}
}
