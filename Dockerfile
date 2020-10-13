FROM java:8

VOLUME /temp

ADD jenkins-0.0.1-SNAPSHOT.jar jenkins.jar

EXPOSE 8083

ENTRYPOINT ["java","-jar","jenkins.jar"]