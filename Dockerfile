FROM openjdk:11.0.2

ENV SCALA_VERSION 2.13.1
ENV SBT_VERSION 1.3.5

COPY ./project/build.properties ./project/
COPY ./build.sbt .

VOLUME /src

# Install sbt
RUN \
  curl -L -o sbt-$SBT_VERSION.deb https://dl.bintray.com/sbt/debian/sbt-$SBT_VERSION.deb && \
  dpkg -i sbt-$SBT_VERSION.deb && \
  rm sbt-$SBT_VERSION.deb && \
  apt-get update && \
  apt-get install sbt && \
  sbt sbtVersion && \
  sbt compile

CMD sbt "~testOnly org.functionalkoans.forscala.Koans"