

## Java & Maven 설치 확인

1. Java jdk-1.8 설치 확인

```sh
% java -version
java version "1.8.0_281"
Java(TM) SE Runtime Environment (build 1.8.0_281-b09)
Java HotSpot(TM) 64-Bit Server VM (build 25.281-b09, mixed mode)
```

2. Maven 설치 확인

```sh
% mvn -v
Apache Maven 3.8.2 (ea98e05a04480131370aa0c110b8c54cf726c06f)
Maven home: /Users/kimjihun/Documents/util/apache-maven-3.8.2
Java version: 1.8.0_281, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre
Default locale: ko_KR, platform encoding: UTF-8
OS name: "mac os x", version: "10.16", arch: "x86_64", family: "mac"
```

* Maven에서 java JDK로 설정되어있는지 확인 <b> /Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home/jre</b> 



## Spring Project 생성 및 실행

1. Maven 명령어로 Spring Project 생성

```sh
% mvn -B archetype:generate -DgroupId=com.example -DartifactId=jcompany -Dversion=1.0.0-SNAPSHOT -DarchetypeArtifactId=maven-archetype-quickstart
```

2. Maven 명령어로 Spring Project 실행

```sh
% mvn spring-boot:run
```



## Jar 생성 및 실행

1. jar 생성하기

```sh
% mvn package 
```

2. jar 실행하기

```sh
% java -jar target/jcompany-1.0.0-SNAPSHOT.jar
```


## DB 정보 변경 방법
 * 파일 오픈 : application.properties
 ```
  #mariaDB
  spring.datasource.url=jdbc:log4jdbc:mariadb://{ip}:{port}/{database명}?serverTimezone=UTC&characterEncoding=UTF-8&allowMultiQueries=true # 
  spring.datasource.driver-class-name=net.sf.log4jdbc.sql.jdbcapi.DriverSpy
  spring.datasource.username={계장명}
  spring.datasource.password={패스워드}
 ```

## 테스트용 필수 데이터베이스 및 테이블 생성
 ```shell
 $ mysql -u root -p # 환경에 맞는 계정으로 로그인
 $ CREATE DATABASE jcompany;
 $ use jcompany;
 $ CREATE TABLE web_info(version VARCHAR(20));
 $ INSERT INTO web_info (version) VALUES ('v1.1.1');
 ```
