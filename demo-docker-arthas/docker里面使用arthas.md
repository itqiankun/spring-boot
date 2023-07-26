mvn clean

mvn install

docker build -t spring-web-arthas .

docker run -d --name web-arthas -p 8888:8888  spring-web-arthas

