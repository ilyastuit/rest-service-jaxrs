FROM tomcat:alpine
USER root
COPY ./.docker/tomcat/tomcat-users.xml /usr/local/tomcat/conf/
COPY ./.docker/tomcat/context.xml /usr/local/tomcat/webapps/manager/META-INF/
COPY ./target/myapp.war /usr/local/tomcat/webapps/myapp.war
CMD ["catalina.sh","run"]