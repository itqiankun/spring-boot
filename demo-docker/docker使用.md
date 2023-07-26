mvn clean

mvn install

docker build -t spring-web .

docker run -d --name web -p 9999:9999  spring-web

