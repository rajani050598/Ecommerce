package com.ecommerce.ecommerce.configuration;

import com.ecommerce.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanFactory {
    @Bean
    public Map<Integer, Product> getproductmap(){
        return new HashMap<>();
    }
}
