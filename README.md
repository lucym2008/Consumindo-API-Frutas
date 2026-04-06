<h1 align="center">
  API fruits
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Youtube&message=@leonardo-machado-arroyo&color=8257E5&labelColor=000000" alt="@lucym2008" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

API basica para aprender sobre a integração de api's externas a meus sistemas

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Webflux](https://docs.spring.io/spring-framework/reference/web/webflux.html)

## Como Executar

### Localmente
- Clonar repositório git
- Construir o projeto:
```
./mvnw clean package
```
- Executar:
```
java -jar place-service/target/place-service-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em (https://www.fruityvice.com/api/fruit/).

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- POST https://www.fruityvice.com/api/fruit
```
{
  "genus": "Fragaria",
  "name": "Strawberry",
  "family": "Rosaceae",
  "order": "Rosales",
  "nutritions": {
    "carbohydrates": 5.5,
    "protein": 0,
    "fat": 0.4,
    "calories": 29,
    "sugar": 5.4
}
```

- GET https://www.fruityvice.com/api/fruit/ + name fruit
```
{
  "name": "Orange",
  "id": 2,
  "family": "Rutaceae",
  "order": "Sapindales",
  "genus": "Citrus",
  "nutritions": {
    "calories": 43,
    "fat": 0.2,
    "sugar": 8.2,
    "carbohydrates": 8.3,
    "protein": 1
  }
```
