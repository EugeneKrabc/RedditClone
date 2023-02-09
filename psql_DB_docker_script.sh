#!/bin/bash

docker run --name psql_container -p 5432:5432 -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=spring_reddit_clone -d postgres:13.3