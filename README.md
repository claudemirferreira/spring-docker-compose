# spring-docker-compose



# 3. Comandos para Executar
   Subir os Contêineres

```
docker-compose up -d
```
Verificar os Logs

bash

```
docker-compose logs -f kafka
```

Listar os Tópicos Use o cliente Kafka para listar os tópicos disponíveis:

```
docker exec -it kafka kafka-topics --bootstrap-server localhost:9092 --list
```

Criar um Tópico
```
docker exec -it kafka kafka-topics --bootstrap-server localhost:9092 --create --topic meu-topico --partitions 1 --replication-factor 1
```
Produzir Mensagens

```
docker exec -it kafka kafka-console-producer --broker-list localhost:9092 --topic meu-topico

```
Digite mensagens e pressione Enter.

Consumir Mensagens

```
docker exec -it kafka kafka-console-consumer --bootstrap-server localhost:9092 --topic meu-topico --from-beginning
```