## PLA Service Discovery

### Docker

Build and Run the docker image

``` 
docker build . -t pla-discovery
docker run --name pla-discovery -d -p 8761:8761 pla-discovery
```