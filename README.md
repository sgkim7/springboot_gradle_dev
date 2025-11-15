# 🚗 Spring Boot + Dev 애플리케이션 (Gradle 기반)

이 프로젝트는 **Spring Boot 백엔드**와 **Thymeleaf 프론트엔드**를 하나로 묶어 동작시키는 구조를 예제로 보여준다.  
Spring Boot는 Gradle로 빌드하며, REST API 엔드포인트를 통해 Thymeleaf로 화면을 구성하는 방식이다.

---

## 📌 프로젝트 생성

프로젝트는 Spring Initializr에서 생성할 수 있다:

👉 https://start.spring.io/

**필수 의존성 예시**
- Spring Web  
- Spring Data JPA  
- Lombok  
- H2 또는 MySQL  
- Spring Boot DevTools  

---

## 📂 GitHub 소스 코드

책/예제 기반 프로젝트 소스는 아래를 참고하면 된다:  
👉 [https://github.com/wikibook/springboot-react](https://github.com/shinsunyoung/springboot-developer-2rd)

---

## 📘 Spring Boot 실행 

```bash
gradle bootRun
```

---

## ⚙️ application.properties
[application.properties](src/main/resources/application.properties)

```yaml
spring:
  jpa:
    show-sql: true
    properties:
      hibernate:
        format_sql: true
    defer-datasource-initialization: true
```

## ⚙️ pom.xml
[build.gradle](build.gradle)

```properties
plugins {
    id 'java'
    id 'org.springframework.boot' version '3.2.0'
    id 'io.spring.dependency-management' version '1.1.0'
}

group 'com.sboot'
version '1.0'
sourceCompatibility = '17'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    runtimeOnly 'com.h2database:h2'
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
}

test {
    useJUnitPlatform()
}
```
