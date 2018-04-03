package pri.holysu.test.springcloudconfigautorefreshclientspecial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties
public class SpringcloudConfigAutorefreshClientSpecialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigAutorefreshClientSpecialApplication.class, args);
	}
}
