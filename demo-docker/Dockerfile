# 基础镜像
FROM openjdk:8-jdk-alpine

# 往容器中添加jar包
ADD target/demo-docker.jar /app.jar

# 启动镜像自动运行程序
ENTRYPOINT ["java","-jar","/app.jar"]
