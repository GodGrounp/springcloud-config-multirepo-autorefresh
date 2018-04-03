package pri.holysu.test.springcloudconfigautorefresheureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudConfigAutorefreshEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigAutorefreshEurekaApplication.class, args);
	}
}
