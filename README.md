# spring-profiles

Spring files can be used to restrict creation of beans to specific environments. In this example a ConcurrentMapCacheManager is used for the development environment, whereas EhCacheCacheManage is used for the production environment.

## Setting Active Profile

The active profile can be set by passing the `spring.profiles.active` value as a JVM system property when starting the application:

```bash
-Dspring.profiles.active=dev
```

Alternatively, the profile can be set in `application.properties`

```
spring.profiles.active=prod
```

Code from https://mkyong.com/spring/spring-profiles-example/ ported to Kotlin
