## **Package jar:**
1. mvn package -DskipTests

## **Docker deploy:**
1. ssh vm and sudo su -
2. mkdir your self folder
3. copy Dockfile, wiremock-standalone-2.24.0.jar and mock-extensions-1.0.0.jar to your self folder on vm
4. cd self folder
5. docker build -t chai/wiremock .
6. check status with docker images
7. docker run -d -p 5050:8080 chai/wiremock **`OR`** docker run -d -p 5443:8443 chai/wiremock --https-port 8443 --verbose

## **Maven plugin for wiremock standalone server:**
1. mvn clean compile wiremock:run