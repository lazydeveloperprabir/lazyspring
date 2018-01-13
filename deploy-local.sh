mvn clean install -DMaven.skip.test=true

chmod 777 ./web-service-impl/target/web-service-impl-0.0.1-SNAPSHOT.jar

java -jar ./web-service-impl/target/web-service-impl-0.0.1-SNAPSHOT.jar