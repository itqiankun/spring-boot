# 基础镜像
FROM openjdk:8-jdk-alpine
# 当前目录
ADD target/demo-docker.jar /app.jar

COPY --from=hengyunabc/arthas:latest /opt/arthas /opt/arthas
RUN apk add --no-cache tini
ENTRYPOINT ["/sbin/tini", "--"]
## 启动镜像自动运行程序
CMD ["java","-jar","/app.jar"]





# 启动镜像自动运行程序
#ENTRYPOINT ["java","-jar","/app.jar"]
