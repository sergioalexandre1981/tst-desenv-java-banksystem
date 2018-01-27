package com.teste.banksystem.clock.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Sergio Alexandre
 * @since 26 jan 2018 11:28
 * 
 * Cache configurator
 *
 */
@Configuration
@EnableCaching
public class CacheConfiguration {

	@Bean
    public CacheManager cacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        List<Cache> caches = new ArrayList<Cache>();
        caches.add(new ConcurrentMapCache("hour"));
        caches.add(new ConcurrentMapCache("minute"));
        cacheManager.setCaches(caches);
        return cacheManager;
    }
	
}
