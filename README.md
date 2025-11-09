NOUS - DevOps Tools e Cloud Computing
Integrantes do Grupo

Gabriel Nakamura Ogata – RM560671

Guilherme Costeira Braganholo – RM560628

Julio Cesar Dias Vilella – RM560494

Visão Geral do Projeto

O NOUS é uma plataforma digital que une educação e saúde mental, oferecendo apoio emocional e orientação educacional personalizada para jovens brasileiros, com base em Inteligência Artificial Generativa da Oracle.

Este repositório contém a parte de DevOps e Cloud Computing do projeto, com:

Configuração do ambiente Docker

Build da imagem da API

Criação e execução de containers

Orquestração via Docker Compose

Código-fonte da API Java

DLL do painel em .NET

Estrutura do Repositório
nous-devops/
├── Dockerfile
├── Dockerfile-painel
├── docker-compose.yml
├── NousApi.java
├── NousApi.class
├── NousApiHelloHandler.class
├── nous-api.jar
├── NousPainel.dll
└── README.md

Execução com Docker
1. Build da Imagem

Execute o comando dentro da pasta do projeto:

docker build -t nous-api .

2. Subir os Containers

Após gerar a imagem, execute:

docker compose up -d


Isso iniciará todos os serviços definidos no arquivo docker-compose.yml.

3. Verificar os Containers em Execução

Use o comando:

docker ps


Resultado esperado:

CONTAINER ID       IMAGE                    STATUS
xxxxxxxxxx         nous-devops-api-aluno     Up
xxxxxxxxxx         nous-devops-api-painel    Restarting/Up

4. Acessar a Aplicação

Abra o navegador e acesse:

http://localhost:8080


Você deverá ver a mensagem:

Servidor NOUS API do Aluno rodando com sucesso!

Tecnologias Utilizadas

Java 17 — API principal do aluno

.NET Core — API do painel de gestão

Docker

Docker Compose

Windows 11 + WSL2 (Linux)

Oracle Cloud Infrastructure (simulado)

Oracle OCI GenAI (inteligência artificial)

Oracle APEX (dashboards e análise)

Arquitetura Resumida
Camada	Tecnologia	Função
Banco de Dados	Oracle Database 23ai	Armazenamento e IA Vector Search
Backend (Aluno)	Java + Spring Boot	APIs REST do app mobile
Backend (Painel)	C# + ASP.NET Core	APIs REST para dashboards
Front-end Web	Oracle APEX	Painéis analíticos
Mobile	React Native + Expo	Interface principal do aluno
Inteligência Artificial	Oracle OCI GenAI	Processamento semântico e preditivo
Repositório GitHub

https://github.com/GabrielNakamura123456/Nous-DevOps
