package org.example.config;

import org.example.repository.SinfRepository;
import org.example.repository.SinfRepositoryImpl;
import org.example.repository.StudentRepository;
import org.example.repository.StudentRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("org.example")
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
    @Bean
    InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    DriverManagerDataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
        dataSource.setUsername("postgres");
        dataSource.setPassword("123");

        return dataSource;
    }

    @Bean
    public StudentRepository getStudentDAO(){
        return new StudentRepositoryImpl(getDataSource());
    }

    @Bean
    public SinfRepository getSinfDAO(){
        return new SinfRepositoryImpl(getDataSource());
    }
}
