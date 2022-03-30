package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repos.VideoGameDao;
import repos.VideoGameDaoImpl;
import services.VideoGameService;

@Configuration
public class BeanConfig {

    @Bean
    public VideoGameDao getVideoGameDao(){
        return new VideoGameDaoImpl();
    }

    @Bean
    public VideoGameService getVideoGameService(){
        return new VideoGameService(getVideoGameDao());
    }
}
