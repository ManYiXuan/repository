package config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.itheima")
@Import(JdbcConfig.class)

public class SpringConfiguration {

}
