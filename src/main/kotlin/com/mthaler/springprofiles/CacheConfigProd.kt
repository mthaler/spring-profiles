package com.mthaler.springprofiles

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.cache.CacheManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.core.io.ClassPathResource
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;

@Configuration
@Profile("prod")
class CacheConfigProd {
    @Bean
    fun cacheManager(): CacheManager {
        log.debug("Cache manager is ehCacheCacheManager")
        return EhCacheCacheManager(ehCacheCacheManager().getObject()!!)
    }

    @Bean
    fun ehCacheCacheManager(): EhCacheManagerFactoryBean {
        val cmfb = EhCacheManagerFactoryBean()
        cmfb.setConfigLocation(ClassPathResource("ehcache.xml"))
        cmfb.setShared(true)
        return cmfb
    }

    companion object {
        private val log: Logger = LoggerFactory.getLogger(CacheConfigDev::class.java)
    }
}