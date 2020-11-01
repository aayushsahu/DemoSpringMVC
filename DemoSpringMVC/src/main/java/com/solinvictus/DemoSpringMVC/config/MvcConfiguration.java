package com.solinvictus.DemoSpringMVC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

import org.h2.server.web.WebServlet;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.*;

@Configuration
@ComponentScan(basePackages="com.solinvictus.DemoSpringMVC")
@EnableWebMvc
// this is a replacement of <servlet-name>-servlet.xml
public class MvcConfiguration extends WebMvcConfigurerAdapter{
  @Bean
  public ViewResolver getViewResolver(){
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    //resolver.setSuffix(".html");
    return resolver;
  }
  
//  @Bean
//  public DataSource getDataSource() {
//      DataSourceBuilder<DataSource> dataSourceBuilder = (DataSourceBuilder<DataSource>) DataSourceBuilder.create();
//      dataSourceBuilder.driverClassName("org.h2.Driver");
//      dataSourceBuilder.url("jdbc:h2:mem:test");
//      dataSourceBuilder.username("SA");
//      dataSourceBuilder.password("");
//      return dataSourceBuilder.build();
//  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
  }
  @Bean
  public MultipartResolver multipartResolver(){
    return new CommonsMultipartResolver();
  }
//  @Override
//  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
//    configurer.enable();
//  }
}
