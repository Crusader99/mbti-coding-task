# Mercedes-Benz Tech Innovation: Coding Task
# 
# This is a configuration for Earthly. Earthly allows to run tests & build
# in containerized environment to make tests reproducible on different
# execution machines.

# Version Requirements
VERSION 0.7
FROM gradle:8.2-jdk17

# Execute JUnit 5 tests with command "earthly +test"
test:
    WORKDIR /project
    COPY --dir . .
    CACHE /home/gradle/.gradle
    RUN gradle test
