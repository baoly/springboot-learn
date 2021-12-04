package com.baoly.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

@ComponentScan(basePackages = {"com.baoly"}, useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        })
@Configuration
public class SpringMvcConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/");
    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello1").setViewName("index");
    }

    @Override
    protected void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("jsp/", ".jsp");
    }

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = converter.getObjectMapper();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        objectMapper.setDateFormat(sdf);
        converters.add(converter);
    }
}
