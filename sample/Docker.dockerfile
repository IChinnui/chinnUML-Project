FROM centos:latest
MAINTAINER Raju
LABEL env="Production"
ENV apparea /data/app
RUN mkdir -p /apparea
ADD ./jenkins.war $apparea
WORKDIR $apparea
CMD ["java", "-jar", "jenkins.war"]
