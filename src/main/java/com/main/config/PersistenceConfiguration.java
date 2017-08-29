package com.main.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.beans.ConstructorProperties;

@Configuration
public class PersistenceConfiguration {
    /**
     * Primary data base
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * SEconday data source
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix="datasource.flyway")
    public DataSource flywayDataSource() {
        return DataSourceBuilder.create().build();
    }


}
