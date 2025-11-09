# Projeto NOUS - API do Aluno
# Integrantes:
# - Gabriel Nakamura Ogata - RM560671
# - Julio César Dias Vilella - RM560494
# - Guilherme Costeira Braganholo - RM560628

FROM eclipse-temurin:25-jdk-alpine

WORKDIR /app

# Copia apenas o JAR
COPY nous-api.jar /app/nous-api.jar

EXPOSE 8080

# Executa o JAR corretamente
ENTRYPOINT ["java", "-jar", "nous-api.jar"]


