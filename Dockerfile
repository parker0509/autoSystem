FROM ubuntu:latest
LABEL authors="gkstn"

ENTRYPOINT ["top", "-b"]