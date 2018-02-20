## PLA Configuration Service

### Docker

Build and Run the docker image

``` 
docker build . -t pla-config-server
docker run --name pla-config-server -d -p 8888:8888 pla-config-server
```