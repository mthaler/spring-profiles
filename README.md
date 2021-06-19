# spring-profiles

Spring files can be used to restrict creation of beans to specific environments. In this example a ConcurrentMapCacheManager is used for the development environment, whereas EhCacheCacheManage is used for the production environment.

## Setting Active Profile

The active profile can be set by passing the `spring.profiles.active` value as a JVM system property when starting the application:

```bash
-Dspring.profiles.active=dev
```

Alternatively, the profile can be set in `application.properties`:

```
spring.profiles.active=prod
```

## Default Profile

To make a profile the default profile, we add "default" to the profile:

```kotlin
 @Profile("prod", "default")
```

The default profile is used if no `spring.profiles.active` is set.

## Credits

The example code is a Kotlin port of the code from (Spring Profiles example)[https://mkyong.com/spring/spring-profiles-example/]
