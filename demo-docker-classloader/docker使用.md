mvn clean

mvn install

docker build -t spring-web-classloader .

docker run -d --name web-classloader -p 9998:9998  spring-web-classloader

