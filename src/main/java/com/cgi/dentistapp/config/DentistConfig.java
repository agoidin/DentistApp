package com.cgi.dentistapp.config;

import com.cgi.dentistapp.entity.DentistEntity;
import com.cgi.dentistapp.repository.DentistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.cgi.dentistapp.repository")
public class DentistConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            DentistRepository repository) {
        return args -> {
            repository.save(new DentistEntity("Maria Gold"));
            repository.save(new DentistEntity("Antonio Silver"));
        };
    }
}
