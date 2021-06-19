package com.mthaler.springprofiles

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.core.env.AbstractEnvironment

class App

private val log: Logger = LoggerFactory.getLogger(App::class.java)

fun main(args: Array<String>) {
    System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev")
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)

    val obj = context.getBean("movieDao") as MovieDao
    log.debug("Result : {}", obj.findByDirector("dummy"))
    log.debug("Result : {}", obj.findByDirector("dummy"))
    log.debug("Result : {}", obj.findByDirector("dummy"))

    (context as ConfigurableApplicationContext).close()
}