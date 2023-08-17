## spring-boot的mybatis-plus快速生成

### 引入坐标

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>

<dependency>
    <groupId>com.baomidou</groupId>
    <artifactId>mybatis-plus-boot-starter</artifactId>
    <version>3.5.2</version>
</dependency>
```

### 连接数据库

![image-20230810101500500](https://itqiankun.oss-cn-beijing.aliyuncs.com/new_picture/myblog/picgo/typora/2023/08/10/2023-08-10-10-15-01-636.png)

![image-20230810101446257](https://itqiankun.oss-cn-beijing.aliyuncs.com/new_picture/myblog/picgo/typora/2023/08/10/2023-08-10-10-14-48-319.png)

### 选择需要创建的表

![image-20230810101549943](https://itqiankun.oss-cn-beijing.aliyuncs.com/new_picture/myblog/picgo/typora/2023/08/10/2023-08-10-10-15-51-097.png)

配置路径

![image-20230810101655804](https://itqiankun.oss-cn-beijing.aliyuncs.com/new_picture/myblog/picgo/typora/2023/08/10/2023-08-10-10-16-56-720.png)

配置注释，lombok，版本等

![image-20230810101742664](https://itqiankun.oss-cn-beijing.aliyuncs.com/new_picture/myblog/picgo/typora/2023/08/10/2023-08-10-10-17-43-561.png)
