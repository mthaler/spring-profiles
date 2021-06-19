package com.mthaler.springprofiles

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.cache.CacheManager
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cache.concurrent.ConcurrentMapCacheManager
import org.springframework.cache.ehcache.EhCacheCacheManager
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.core.io.ClassPathResource


@Configuration
@EnableCaching
@ComponentScan("com.mthaler.springprofiles.*")
class AppConfig {

    /*private val log: Logger = LoggerFactory.getLogger(AppConfig::class.java)

    @Bean
    @Profile("dev")
    fun concurrentMapCacheManager(): CacheManager? {
        log.debug("Cache manager is concurrentMapCacheManager")
        return ConcurrentMapCacheManager("movieFindCache")
    }

    @Bean
    @Profile("live")
    fun cacheManager(): CacheManager? {
        log.debug("Cache manager is ehCacheCacheManager")
        return EhCacheCacheManager(ehCacheCacheManager().getObject()!!)
    }

    @Bean
    @Profile("live")
    fun ehCacheCacheManager(): EhCacheManagerFactoryBean {
        val cmfb = EhCacheManagerFactoryBean()
        cmfb.setConfigLocation(ClassPathResource("ehcache.xml"))
        cmfb.setShared(true)
        return cmfb
    }*/
}