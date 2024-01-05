package com.Website.LaptopStore.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**").addResourceLocations("/product_images/");
//		registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
//		registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
//		registry.addResourceHandler("/Frontend/img/**").addResourceLocations("/images/");
//		registry.addResourceHandler("/Frontend/css/**").addResourceLocations("/css/");
//		registry.addResourceHandler("/Frontend/js/**").addResourceLocations("/js/");
	}
	
	
	
	
}
