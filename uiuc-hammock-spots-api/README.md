# UIUCHammockSpots API

## How to start the UIUCHammockSpots application

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/uiuc_hammock_spots-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

## Health Check

To see your applications health enter url `http://localhost:8081/healthcheck`

## Docker Usage

### Build Docker image
```
docker build -t uiuc-hammock-spots .
```

### Create environment variables file `.env`
```
DB_USERNAME=<YOUR USERNAME>
DB_PASSWORD=<YOUR PASSWORD>
DB_URL=jdbc:mysql://<YOUR DB URL>
```

### Run Docker image
```
docker run -p <HOST PORT TO BIND>:8080 --env-file .env uiuc-hammock-spots
```