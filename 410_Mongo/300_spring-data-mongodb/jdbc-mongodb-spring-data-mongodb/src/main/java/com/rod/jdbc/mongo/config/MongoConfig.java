
package com.rod.jdbc.mongo.config;

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;  

@Configuration
public class MongoConfig {
	
	
	@Bean Mongo mongo() throws Exception {
			Mongo mongo = new MongoClient("192.168.221.53");
			return mongo;
		}  
	  	
	 @Bean MongoTemplate mongoTemplate() throws Exception {  
	        return new MongoTemplate(mongo(),"test");  
	    }

}
