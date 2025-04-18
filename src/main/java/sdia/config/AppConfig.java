package sdia.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"sdia.dao", "sdia.metier"})

public class AppConfig {
}
