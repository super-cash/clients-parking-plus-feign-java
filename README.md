# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation & Usage

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

After the client library is installed/deployed, you can use it in your Maven project by adding the following to your **pom.xml**:

```xml
<dependency>
    <groupId>cash.super_.platform.client</groupId>
    <artifactId>parking-plus-client-feign</artifactId>
    <version>2.0.0-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

For **build.gradle**, add the Maven repository from the original package as follows:

```groovy
repositories {
    mavenLocal()
    mavenCentral()

    maven {
        url "https://gitlab.com/api/v4/projects/22268428/packages/maven"
        credentials(HttpHeaderCredentials) {
            name "Private-Token"
            value "XyV*******u9r"
        }
        authentication {
            header(HttpHeaderAuthentication)
        }
    }
}
```

Then, add the dependency as follows:

```groovy
    implementation group: "cash.super_.platform.client", name: "parking-plus-client-feign", version: "2.0.0-SNAPSHOT"
```

# Deployment

* This is manually deployed to the Gitlab Maven repository. 

https://gitlab.com/api/v4/projects/22268428/packages/maven

Use the following token `Xy****9r` to publish

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




