# NOUS - DevOps Tools e Cloud Computing

## Integrantes do Grupo
- **Gabriel Nakamura Ogata – RM560671**
- **Guilherme Costeira Braganholo – RM560628**
- **Julio Cesar Dias Vilella – RM560494**

---

## Visão Geral do Projeto
O **NOUS** é uma plataforma que une educação e saúde mental, oferecendo apoio emocional e orientação educacional personalizada para jovens brasileiros, com base em IA Generativa da Oracle.

Este repositório contém a parte de **DevOps e Cloud Computing** do projeto: ambiente Docker, build de imagem, containers e orquestração com Docker Compose.

---

## Estrutura do Repositório

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

yaml
Copiar código

---

## Execução com Docker

### 1) Build da Imagem
Execute dentro da pasta do projeto:
```bash
docker build -t nous-api .
2) Subir os Containers
bash
Copiar código
docker compose up -d
Irá iniciar os serviços definidos no docker-compose.yml.

3) Verificar Containers em Execução
bash
Copiar código
docker ps
Exemplo de saída esperada:

mathematica
Copiar código
CONTAINER ID   IMAGE                    STATUS
xxxxxx         nous-devops-api-aluno    Up
xxxxxx         nous-devops-api-painel   Restarting/Up
4) Acessar a Aplicação
Abra no navegador:

arduino
Copiar código
http://localhost:8080
Mensagem esperada:

arduino
Copiar código
Servidor NOUS API do Aluno rodando com sucesso!
Tecnologias Utilizadas

Java 17 — API principal do aluno

.NET Core — API do painel de gestão

Docker & Docker Compose

Windows 11 + WSL2 (Linux)

Oracle Cloud Infrastructure (simulado)
Arquitetura Resumida
| Camada           | Tecnologia           | Função                              |
| ---------------- | -------------------- | ----------------------------------- |
| Banco de Dados   | Oracle Database 23ai | Armazenamento + IA Vector Search    |
| Backend (Aluno)  | Java + Spring Boot   | APIs REST do app mobile             |
| Backend (Painel) | C# + ASP.NET Core    | APIs REST para dashboards           |
| Front-end Web    | Oracle APEX          | Painéis analíticos                  |
| Mobile           | React Native + Expo  | Interface principal do aluno        |
| IA               | Oracle OCI GenAI     | Processamento semântico e preditivo |


Repositório
https://github.com/GabrielNakamura123456/Nous-DevOps


