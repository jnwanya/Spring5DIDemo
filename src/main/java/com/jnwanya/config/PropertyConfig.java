package com.jnwanya.config;

import com.jnwanya.examplebeans.FakeDataSource;
import com.jnwanya.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by Jnwanya on
 * Sat, 06 Jan, 2018.
 */
@Configuration
// @PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${jnwanya.username}")
    private String username;

    @Value("${jnwanya.password}")
    private String password;

    @Value("${jnwanya.dburl}")
    private String dbUrl;

    @Value("${jnwanya.jms.username}")
    private String jmsUsername;

    @Value("${jnwanya.jms.password}")
    private String jmsPassword;

    @Value("${jnwanya.jms.url}")
    private String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setDbUrl(dbUrl);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUsername(username);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        fakeJmsBroker.setUsername(jmsUsername);
        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
