# Bartender

## Run the System
We can easily run the whole with only a single command:
```bash
docker compose up
```


The services can be run on the background with command:
```bash
docker compose up -d
```

## Stop the System
Stopping all the running containers is also simple with a single command:
```bash
docker compose down
```

If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:
```bash
docker compose down --rmi all
```

## Constrains 
- iterations must an integer in range [1,7]
- id must be an integer in range [1,5]
- both params are mandatory

## Usage/Examples
```bash
  curl --location 'http://localhost:8081/api/serve?iterations=1&id=3'
```

```bash
  curl --location 'http://localhost:8081/api/serve?iterations=3&id=2'
```

The following will throw an error: 
```bash
  curl --location 'http://localhost:8081/api/serve?iterations=30&id=2'
```

