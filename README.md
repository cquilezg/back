# Polineko - back

The project uses Kotlin 2.0 using a JDK 21 version. You can choose whatever you want, i.e. this one:
[OpenJDK 21](https://www.oracle.com/java/technologies/downloads/?er=221886#java21).  
This project uses [Quarkus](https://quarkus.io/), similar to [Spring](https://spring.io/) but optimized to get faster
app starts and get an improved developer experience.


## Development
### Running the application in dev mode

You can run your application in dev mode that enables live coding using:

On Linux or Git Bash:
```shell script
./gradlew quarkusDev
```

On Windows
```shell script
.\gradlew.bat quarkusDev
```

> **_NOTE:_**  Quarkus ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.


### Debugging
- Run app in [Dev mode](#running-the-application-in-dev-mode).
- Find in the logs: 'Listening for transport dt_socket at address: 5005', and click in 'Attach Debugger'.
- If you don't find that log you need to attach a debugger manually. Create a Run configuration named
  'Remote JVM debug' pointing to localhost:5005.

## Build Docker image
Reference guide: https://es.quarkus.io/guides/container-image#building  
The following command build an image using Jib through the Quarkus extension `quarkus-container-image-jib`
specified in section [Related guides](#related-guides).
```shell script
./gradlew build
```

## Creating a native executable

You can create a native executable using:

```shell script
./gradlew build -Dquarkus.native.enabled=true
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./gradlew build -Dquarkus.native.enabled=true
```

You can then execute your native executable with: `./build/back-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/gradle-tooling>.

## Project generation

Generated with: https://code.quarkus.io/?g=com.polineko&a=back&b=GRADLE_KOTLIN_DSL&nc=true&e=security-jpa&e=jdbc-postgresql&e=config-yaml&e=rest&e=container-image-jib&e=hibernate-validator&e=smallrye-health&e=liquibase&e=kotlin&e=hibernate-orm-panache-kotlin&e=rest-kotlin-serialization

## Related Guides

- REST ([guide](https://quarkus.io/guides/rest)): A Jakarta REST implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.
- Hibernate ORM with Panache and Kotlin ([guide](https://quarkus.io/guides/hibernate-orm-panache-kotlin)): Define your persistent model in Hibernate ORM with Panache
- Hibernate Validator ([guide](https://quarkus.io/guides/validation)): Validate object properties (field, getter) and method parameters for your beans (REST, CDI, Jakarta Persistence)
- Kotlin ([guide](https://quarkus.io/guides/kotlin)): Write your services in Kotlin
- YAML Configuration ([guide](https://quarkus.io/guides/config-yaml)): Use YAML to configure your Quarkus application
- Liquibase ([guide](https://quarkus.io/guides/liquibase)): Handle your database schema migrations with Liquibase
- SmallRye Health ([guide](https://quarkus.io/guides/smallrye-health)): Monitor service health
- Security JPA ([guide](https://quarkus.io/guides/security-getting-started)): Secure your applications with username/password stored in a database via Jakarta Persistence
- JDBC Driver - PostgreSQL ([guide](https://quarkus.io/guides/datasource)): Connect to the PostgreSQL database via JDBC
