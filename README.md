# vulfocus-spring-boot-starter



[![GitHub (pre-)release](https://img.shields.io/github/release/fofapro/vulfocus-spring-boot-starter/all.svg)](https://github.com/fofapro/vulfocus-spring-boot-starter/releases) [![stars](https://img.shields.io/github/stars/fofapro/vulfocus-spring-boot-starter.svg)](https://github.com/fofapro/vulfocus-spring-boot-starter/stargazers) [![license](https://img.shields.io/github/license/fofapro/vulfocus-spring-boot-starter.svg)](https://github.com/fofapro/vulfocus-spring-boot-starter/blob/master/LICENSE)

[Chinese document](https://github.com/fofapro/vulfocus-spring-boot-starter/blob/master/README_zh.md)

## Vulfocus API


[`Vulfocus API`](https://fofapro.github.io/vulfocus/#/VULFOCUSAPI) is the `RESUFul API` interface provided by [`Vulfocus`](http://vulfocus.io/) for development, allowing Developers integrate [`Vulfocus`](http://vulfocus.io) in their own projects.

## Vulfocus SDK

The `Spring Boot` version of `SDK` written based on the [`Vulfocus API`](https://fofapro.github.io/vulfocus/#/VULFOCUSAPI) makes it easy for `Spring Boot` developers to quickly integrate [`Vulfocus`](http://vulfocus.io/)  into their projects.

## Add dependency

### Apache Maven

```
<dependency>
  <groupId>com.r4v3zn.vulfocus</groupId>
  <artifactId>vulfocus-spring-boot-starter</artifactId>
  <version>0.0.1</version>
</dependency>
```

## USE

|field|description|
| ---- | ---- |
|`addr`|[`Vulfocus`](http://vulfocus.io/) URL|
|`username`|User login [`Vulfocus`](http://vulfocus.io/) userbox `username`|
|`licence`|Please go to the [`personal center`](http://vulfocus.fofa.so/#/profile/index) to view `API licence`|

### Configuration

Configure the `application.yml` or `application.properties` file.

#### application.yml
```yaml
vulfocus:
  username: 
  license: 
```
#### application.properties
```properties
vulfocus.username=
vulfocus.license=
```

### Pull Images

#### Code

```java
@Autowired
private FofaClient client;

public void test() throws Exception {
  List<ImageEntity> imageEntityList = client.imageList();
  System.out.println(imageEntityList);
}
```

#### Response

```
[ImageEntity{imageName='vulfocus/webmin-cve_2020_35606:latest', imageVulName='Webmin 命令执行漏洞 （CVE-2020-35606）', imageDesc='Webmin是Webmin社区的一套基于Web的用于类Unix操作系统中的系统管理工具。
Webmin 1.962版本及之前版本存在安全漏洞，该漏洞允许执行任意命令。任何被授权使用Package Updates模块的用户都可以使用根权限通过包含和的向量执行任意命令。
账户密码：root:password'}]
```

### Start

#### Code

```java
@Autowired
private FofaClient client;

public void test() throws Exception {
  List<ImageEntity> imageEntityList = client.imageList();
  ImageEntity imageEntity = imageEntityList.get(0);
  System.out.println(imageEntity);
  System.out.println(client.start(imageEntity.getImageName()));
}
```


#### Response

```
ImageEntity{imageName='vulfocus/webmin-cve_2020_35606:latest', imageVulName='Webmin 命令执行漏洞 （CVE-2020-35606）', imageDesc='Webmin是Webmin社区的一套基于Web的用于类Unix操作系统中的系统管理工具。
Webmin 1.962版本及之前版本存在安全漏洞，该漏洞允许执行任意命令。任何被授权使用Package Updates模块的用户都可以使用根权限通过包含和的向量执行任意命令。
账户密码：root:password'}

HostEntity{host='118.193.36.37:54240', port='{"10000": "54240"}'}
```

### Stop

#### Code

```java
@Autowired
private FofaClient client;

public void test() throws Exception {
  List<ImageEntity> imageEntityList = client.imageList();
  ImageEntity imageEntity = imageEntityList.get(0);
  System.out.println(imageEntity);
  System.out.println(client.stop(imageEntity.getImageName()));
}
```

#### Response

```
ImageEntity{imageName='vulfocus/webmin-cve_2020_35606:latest', imageVulName='Webmin 命令执行漏洞 （CVE-2020-35606）', imageDesc='Webmin是Webmin社区的一套基于Web的用于类Unix操作系统中的系统管理工具。
Webmin 1.962版本及之前版本存在安全漏洞，该漏洞允许执行任意命令。任何被授权使用Package Updates模块的用户都可以使用根权限通过包含和的向量执行任意命令。
账户密码：root:password'}

停止成功
```

### Delete

#### Code

```java
@Autowired
private FofaClient client;

public void test() throws Exception {
  List<ImageEntity> imageEntityList = client.imageList();
  ImageEntity imageEntity = imageEntityList.get(0);
  System.out.println(imageEntity);
  System.out.println(client.delete(imageEntity.getImageName()));
}
```

#### Response

```
ImageEntity{imageName='vulfocus/webmin-cve_2020_35606:latest', imageVulName='Webmin 命令执行漏洞 （CVE-2020-35606）', imageDesc='Webmin是Webmin社区的一套基于Web的用于类Unix操作系统中的系统管理工具。
Webmin 1.962版本及之前版本存在安全漏洞，该漏洞允许执行任意命令。任何被授权使用Package Updates模块的用户都可以使用根权限通过包含和的向量执行任意命令。
账户密码：root:password'}

删除成功
```

## Update Log

2021-11-27

```
Release
```
