/*
 *  Copyright 2018, Mindtree Ltd. - All Rights Reserved.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.wisedu.blockchain.main;

import com.wisedu.blockchain.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
/**
 * @author cheng en
 */


/**
 * class for starting the spring boot application
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.wisedu.blockchain"})
@EnableConfigurationProperties(Config.class)
public class Start extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Start.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Start.class);
    }

//	@Bean
//	public FilterRegistrationBean jwtFilter() {
//		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//		registrationBean.setFilter(new JwtFilter());
//		registrationBean.addUrlPatterns("/api/*");
//
//		return registrationBean;
//	}

}

