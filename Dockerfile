FROM openjdk:14-jdk-alpine
LABEL maintainer="Yuriy Fedorenko yurafedorenko721@gmail.com"
ADD /build/libs/kubernates-demo-0.0.1-SNAPSHOT.jar kubernates-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "kubernates-demo-0.0.1-SNAPSHOT.jar"]