
<h1 align="center">iot-data-processor</h1>

<h2 align="left">General info</h2>

This is the backend part of iot-data-processor based on Event-Driven Microservices architecture. </br>
User Interface created by using React with Typescript:


A system for collecting, processing and visualizing data from devices and controlling them.<br>
An application written in a microservice architecture using event-driven development.<br>
In this version of application, all services running on premise,<br>
the application is built with the idea of ​​adapting cloud solutions (e.g. AWS IoT Core, AWS Greengrass). <br>

Architecture diagram:
![Blank diagram](https://github.com/user-attachments/assets/778fca0b-9836-4efc-bb6c-b3ff88c8cce0)

<h3 align="left">Basic features:</h3>

- [ ] Collecting data from devices and sensors via gateways using MQTT, OPC UA, Kafka, and other suitable methods of communication.
- [ ] Controlling devices by sending data to them.
- [ ] Device connection configuration. 
- [ ] Dynamic Rule Engine for processing data, created by diagram low-code tool.
- [ ] User and Roles management by implementing OAuth2.
- [ ] Low-code tool for creating data processing flow.
- [ ] Customizable User Interface to display the data you need.

<h3 align="left">Application services:</h3>

- <a href="https://github.com/JacekGos/team-finder-microservices/tree/main/api-gateway">Api Gateway </a>
- <a href="https://github.com/JacekGos/team-finder-microservices/tree/main/discovery-server">Discovery Server </a> - Eureka Server
- <a href="https://github.com/JacekGos/team-finder-microservices/tree/main/event-core-service">Event Core Service </a> - Base service for configuring connections and devices

<h3 align="left">Technologies and tools:</h3>

- Java 21
- Spring Boot 3.4.x
- Spring Cloud
- Spring Security
- Spring Data JPA
- Hibernate
- PostgreSQL 17
- JUnit
- Mockito
- Kafka
- Docker
- Keycloak
- MQTT broker
- Eclipse Milo (OPC UA Server)
- React Flow
