package pe.edu.i202224541.cl1_jpa_data_guevara_alex.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConexionesConfig {

    @Value("${DB_WORLD_URL}")
    private String dbSakilaUrl;
    @Value("${DB_ WORLD_USER}")
    private String dbSakilaUser;
    @Value("${DB_WORLD_PASS}")
    private String dbSakilaPass;
    @Value("${DB_WORLD_DRIVER}")
    private String dbSakilaDriver;

    @Bean
    public HikariDataSource hikariDataSource(){

        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(dbSakilaUrl);
        config.setUsername(dbSakilaUser);
        config.setPassword(dbSakilaPass);
        config.setDriverClassName(dbSakilaDriver);
        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(400000);
        config.setConnectionTimeout(45000);

        System.out.println("###### Hikari Inicializado ######");
        return new HikariDataSource(config);

    }

}
