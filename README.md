
# URL Shortener Service

<a href="https://www.linkedin.com/in/natalia-feitosa-cga-cfp" target="_blank" style="text-decoration:none">
    <img src="https://img.shields.io/badge/LinkedIn-000000?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn">
</a>

## Overview
The URL Shortener Service is a back-end application that allows you to shorten long URLs to make them more compact and easier to share. This project is implemented using Java, MongoDB, and Docker.
The original code was build by Build and Run channel with some adaptations for tests.

## Link to the Front-End
For more information about the front-end service, you can access the repository [here](https://github.com/tecnologiaefinancas/url-shortener-front).

## Example Usage
To shorten a URL, make a POST request to the following endpoint:

```
[POST] {{host}}/shorten-url
```

### Request
```json
{
    "url": "https://backendbrasil.com.br"
}
```

### Response
```json
{
    "url": "https://xxx.com/DXB6V"
}
```

## Technologies Used
- Java
- MongoDB
- Docker

## Getting Started
Follow the instructions below to set up and run the URL Shortener Service on your local machine.

### Prerequisites
- Java Development Kit (JDK) installed
- MongoDB installed and running
- Docker installed

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/url-shortener-service.git
   cd url-shortener-service
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

### Running the Application
1. Start MongoDB if it's not already running:
   ```bash
   mongod
   ```

2. Run the application:
   ```bash
   java -jar target/url-shortener-service-0.0.1-SNAPSHOT.jar
   ```

### Using Docker
To run the application using Docker, follow these steps:

1. Build the Docker image:
   ```bash
   docker build -t url-shortener-service .
   ```

2. Run the Docker container:
   ```bash
   docker run -p 8080:8080 url-shortener-service
   ```

## Endpoints
### POST /shorten-url
Shortens a long URL.

**Request:**
```json
{
    "url": "https://backendbrasil.com.br"
}
```

**Response:**
```json
{
    "url": "https://xxx.com/DXB6V"
}
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- Thanks to the developers and contributors who maintain Java, MongoDB, and Docker.

---
