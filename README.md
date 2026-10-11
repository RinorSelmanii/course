# Java Spring-Boot REST API 

## About
REST API using Java Spring-boot that manages two entities subject and Student with a Layered Architecture
-Controllers that handel the http requests,
-Services that contain teh application Logic,
-Repositories that communicate with the DB.
-And for the db used MySql.

The subject entity supports CRUD operations(GET ,POST ,PUT ,DELETE), as Student supports only (GET, Post).
After i finished with the 2 entities i created a DoubleController.java that returns data from both entities with a single response , for that i needed to use Object Lists that store the results from the Service methods that each calls and HashMap to store both lists , each that contains a specifik KEY.

## Features
-CRUD operations
-RESTful API endpoints
-MySql db integration
-Single controller that retrives data from both Entities
-Http request handling

## Tech stack
-Programming language Java
-Framework spring-boot
-Database MySql

## CRUD Operations
-GET to Retrive Data from Student ,Subject or Both with one response.
-POST create new Student or Subject records.
-PUT update existing Subject data.
-DELETE delete Subject data. 

## How to use
1.clone the repository
2.open the project in your IDE 
3.create a MySql Database , " The tables will Create automaticly "
3.Configure your MySql DB credentials in application.properties
4.Start application in terminal .\mvnw spring-boot:run 
5.Use a testing tool or my requests.http file to send HTTP request to the API
