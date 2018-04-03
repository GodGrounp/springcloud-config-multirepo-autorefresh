package pri.holysu.test.springcloudconfigautorefreshclientcat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudConfigAutorefreshClientCatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigAutorefreshClientCatApplication.class, args);
	}
}
