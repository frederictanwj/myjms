package myjms.producer.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "myjms.producer")
@Import({ MessagingConfiguration.class })
public class AppConfig {

	// Put Other Application configuration here.
}
