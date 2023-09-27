# Spring Boot REST API

This repository contains a Spring Boot application that implements a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on items.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Postman Testing](#postman-testing)
- [Contributing](#contributing)

## Features

- Create, read, update, and delete items.
- Store and retrieve item data from a MySQL database.
- Built using Spring Boot for rapid development and easy deployment.

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Apache Maven for building the project.
- MySQL database server.
- Git for cloning the repository (optional).

### Installation

1. Clone the repository:

   git clone https://github.com/CodeByGagan/Sprint3.git

2. Navigate to the project directory:

   cd Sprint3

3. Build the project using Maven:

   mvn clean install

4. Run the application:

   java -jar target/Sprint3-1.0.0.jar

## Usage

Once the application is running, you can use any REST API client (e.g., Postman) to interact with the API.

## API Endpoints

- **POST /postitem**: Create a new item.
- **GET /getitem**: Retrieve a list of all items.
- **PUT /updateitem/{id}**: Update an item by ID.
- **DELETE /deleteitem/{id}**: Delete an item by ID.

Make sure to replace `{id}` with the actual item ID you want to update or delete.

## Postman Testing
You can use Postman to test the API endpoints. Below are the results of the CRUD operations:

### POST Method
![image](https://github.com/CodeByGagan/Sprint3/assets/108939039/a3a8dd1e-d702-4e30-ae67-a1b104153c1d)

### GET Method
![image](https://github.com/CodeByGagan/Sprint3/assets/108939039/b2849e5b-9a74-4214-8889-0d7a4806894c)

### PUT Method
![image](https://github.com/CodeByGagan/Sprint3/assets/108939039/ac9480dd-eee1-4514-b4d7-460a138efc30)

### DELETE Method
![image](https://github.com/CodeByGagan/Sprint3/assets/108939039/69862bc4-ede9-4490-aa6b-59a1a0e0d279)

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please create a GitHub issue or submit a pull request.

