# vulfocus-spring-boot-starter


[![GitHub (pre-)release](https://img.shields.io/github/release/fofapro/vulfocus-java/all.svg)](https://github.com/fofapro/vulfocus-spring-boot-starter/releases) [![stars](https://img.shields.io/github/stars/fofapro/vulfocus-spring-boot-starter.svg)](https://github.com/fofapro/vulfocus-spring-boot-starter/stargazers) [![license](https://img.shields.io/github/license/fofapro/vulfocus-spring-boot-starter.svg)](https://github.com/fofapro/vulfocus-spring-boot-starter/blob/master/LICENSE)

[English document](https://github.com/fofapro/vulfocus-spring-boot-starter/blob/master/README.md)

## Vulfocus API

[`Vulfocus API`](https://fofapro.github.io/vulfocus/#/VULFOCUSAPI) 是  [`Vulfocus`](http://vulfocus.io/) 为开发提供的 `RESUFul API`接口，允许开发者在自己的项目中集成 [`Vulfocus`](http://vulfocus.io)。


## Vulfocus SDK

基于 [`Vulfocus API`](https://fofapro.github.io/vulfocus/#/VULFOCUSAPI) 编写的 `Spring Boot` 版 `SDK`，方便`Spring Boot`开发者快速将  [`Vulfocus`](http://vulfocus.io/) 集成到自己的项目中。


## 添加依赖

### Apache Maven

```
<dependency>
  <groupId>com.r4v3zn.vulfocus</groupId>
  <artifactId>vulfocus-spring-boot-starter</artifactId>
  <version>0.0.1</version>
</dependency>
```

## USE

|字段名称|描述|
| ---- | ---- |
|`addr`|[`Vulfocus`](http://vulfocus.io/) 地址|
|`username`|用户登陆 [`Vulfocus`](http://vulfocus.io/) 使用的用户名|
|`licence`|前往 [`个人中心`](http://vulfocus.fofa.so/#/profile/index) 查看 `API Key`|

### 配置

需要配置项目中的 `application.yml` 或 `application.properties` 文件。

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

### 获取镜像

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

### 启动

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

### 停止

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

### 删除

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

## 更新日志

2021-11-26

```
Release
```
