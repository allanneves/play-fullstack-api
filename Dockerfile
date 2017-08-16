FROM ubuntu:16.04
MAINTAINER Allan Haerber

#############################################################
# INSTALL JAVA 8
#############################################################
RUN apt-get update \
    && apt-get install -y software-properties-common debconf-utils \
    && add-apt-repository -y ppa:webupd8team/java \
    && echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 select true" | debconf-set-selections \
    && apt-get update && apt-get install -y oracle-java8-installer

#############################################################
# INSTALL SCALA SBT
#############################################################
RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list \
    && apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823 \
    && apt-get install -y apt-transport-https \
    && apt-get update && apt-get install -y sbt

#############################################################
# DEGRIFAUTO
#############################################################
VOLUME /project_home
COPY . /project_home
EXPOSE 9000
WORKDIR /project_home
RUN sbt clean compile
#CMD ["sbt","run"]