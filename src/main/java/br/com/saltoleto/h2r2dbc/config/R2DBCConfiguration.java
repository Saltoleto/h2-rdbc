package br.com.saltoleto.h2r2dbc.config;

import converter.CharToBooleanConverter;
import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

import java.util.List;

@Configuration
@EnableR2dbcRepositories
public class R2DBCConfiguration extends AbstractR2dbcConfiguration {
    @Override
    @Bean
    public ConnectionFactory connectionFactory() {
        return new PostgresqlConnectionFactory(
                PostgresqlConnectionConfiguration.builder()
                        .host("172.19.0.2")
                        .port(5432)
                        .username("postgres")
                        .password("postgres")
                        .database("mydatabase")
                        .build());
    }

    @Override
    protected List<Object> getCustomConverters() {
        return List.of(new CharToBooleanConverter());
    }
}
