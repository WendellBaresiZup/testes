# Calculadora Spring Boot

Este é um projeto simples de uma calculadora web desenvolvida com Spring Boot, Thymeleaf e Java 17.

## Funcionalidades

- Adição, subtração, multiplicação e divisão de dois números.
- Interface web simples para realizar as operações matemáticas.

## Estrutura do Projeto

## Dependências

- Spring Boot
- Spring Web
- Thymeleaf
- JUnit 5 (para testes)
- Mockito (para testes)

## Como Executar

1. Certifique-se de que você tenha o JDK 17 e o Maven instalados.

2. Clone o repositório:
```sh
    git clone https://github.com/seu-usuario/calculadora-spring-boot.git
    cd calculadora-spring-boot
```

## Estrutura do Código
- CalculadoraController

Controlador responsável por lidar com as requisições HTTP e direcioná-las para os serviços apropriados.

- CalculadoraService

Serviço responsável por realizar as operações matemáticas.

- CalculadoraModel

Classe modelo que representa os dados da calculadora.

- index.html

Página HTML simples usando Thymeleaf para interagir com a calculadora.

- Testes

Testes unitários foram criados usando JUnit 5 e Mockito para verificar a funcionalidade dos serviços e controladores.

- Executando os Testes

#### Para executar os testes:
- Siga o caminho calculadora/src/test/java/br.com.zup.calculadora e execute a classe
```sh
    CalculadoraApplicationTests
```

Informações Finais:
- Esse projeto foi clonado do link https://github.com/rudr1gu/CalculadoraJava/tree/main

