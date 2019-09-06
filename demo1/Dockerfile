FROM server:v0-2-4
COPY demo1-0.0.1.war \
 tomcatconf.zip \
 /var/opt/appserver/

RUN mkdir /var/opt/appserver/apps \
&& mkdir /var/opt/appserver/instance \
&& mkdir /var/opt/appserver/instance/logs \
&& unzip /var/opt/appserver/demo1-0.0.1.war -d /var/opt/appserver/apps/demo1 \
&& unzip /var/opt/appserver/tomcatconf.zip -d /var/opt/appserver/env/ \
&& rm -v /var/opt/appserver/demo1-0.0.1.war \
&& chmod 770 -R /var/opt/appserver


EXPOSE 8080
WORKDIR /var/opt/appserver/env/
CMD ["./bin/catalina.sh", "run"]