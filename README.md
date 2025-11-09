# NOUS - DevOps Tools e Cloud Computing

## Integrantes do Grupo
- Gabriel Nakamura Ogata – RM560671  
- Guilherme Costeira Braganholo – RM560628  
- Julio Cesar Dias Vilella – RM560494  

---

## Visão Geral do Projeto

O NOUS é uma plataforma digital que une educação e saúde mental, oferecendo apoio emocional e orientação educacional personalizada para jovens brasileiros, com base em Inteligência Artificial Generativa da Oracle.  

Este repositório contém a parte DevOps e Cloud Computing do projeto — com o ambiente Docker configurado, imagens e containers para o microsserviço principal da NOUS API do Aluno.

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

### 1. Build da Imagem
```bash
docker build -t nous-api .
2. Subir os Containers
bash
Copiar código
docker compose up -d
3. Verificar se estão rodando
bash
Copiar código
docker ps
4. Acessar a Aplicação
Abra o navegador e vá para:
http://localhost:8080

Se tudo estiver certo, verá a mensagem:
Servidor NOUS API do Aluno rodando com sucesso!

Tecnologias Utilizadas
Java 17 (API principal do aluno)

.NET Core (API do painel de gestão)

Docker e Docker Compose

Oracle Cloud Infrastructure (IaaS - simulado)

Windows 11 + WSL2 (Linux)

Arquitetura Resumida
Camada	Tecnologia	Função
Banco de Dados	Oracle Database 23ai	Armazenamento relacional e IA Vector Search
Backend (Aluno)	Java + Spring Boot	APIs REST do app mobile
Backend (Painel)	C# + ASP.NET Core	APIs REST para dashboards
Front-end Web	Oracle APEX	Painéis analíticos
Mobile	React Native + Expo	Interface principal do aluno
IA	Oracle OCI GenAI	Processamento semântico e preditivo



Documentação Complementar
PDF Entregue: Relatório DevOps & Cloud Computing com prints, evidências e descrição técnica.

Repositório GitHub: https://github.com/GabrielNakamura123456/Nous-DevOps
