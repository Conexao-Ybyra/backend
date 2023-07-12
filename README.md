# Projeto Conexão Ybyra 
Backend do Projeto Integrador Generation Brasil T65
https://conexaoybyra.onrender.com
![db_conexao_ybyra](https://github.com/Conexao-Ybyra/backend/assets/113945437/64b2f7b2-571f-4449-a2ef-99a91fd8c655)

## Descrição
O projeto Conexão Ybyra é uma aplicação Java que utiliza o framework Spring Boot, o banco de dados MySQL e o Insomnia para testes CRUD. 
O objetivo do projeto é fornecer uma API para uma rede social que conecta usuários e atividades em parques e praças públicas. (revisar)

## Funcionalidades
- CRUD completo para o recurso Postagem, com 6 métodos: criar, ler, atualizar e excluir produtos.
- CRUD completo para o recurso Tema, com 6 métodos: criar, ler, atualizar e excluir categorias.
- Relacionamento do tipo One-to-Many entre as classes Tema e Postagem.
- Utilização do padrão MVC (Model-View-Controller) no Spring: Model, Repository e Controller.
- Testes de toda a API no Insomnia.

## Pré-requisitos
Antes de executar o projeto, verifique se você possui os seguintes requisitos:
- Java Development Kit (JDK) instalado na versão 17.0.7 ou superior.
- MySQL instalado e configurado.
- Insomnia (ou outro software de teste de API) instalado.

## Instalação e Configuração
Siga os passos abaixo para instalar e configurar o ambiente do projeto:

1. Faça o clone deste repositório.
2. Importe o projeto na sua IDE de preferência.
3. Configure as informações de conexão com o banco de dados MySQL no arquivo `application.properties` (localizado em `src/main/resources`).
4. Execute o script SQL fornecido para criar o banco de dados e as tabelas necessárias.
5. Inicie a aplicação.

## Utilização
Para utilizar a API, siga as instruções abaixo:

1. Abra o Insomnia (ou outro software de teste de API).
2. Importe a coleção de requisições disponível no arquivo `insomnia_collection.json`.
3. Execute as requisições disponíveis para interagir com os recursos de produtos e categorias.
4. Testes Endpoints no Insomnia:

## Contribuição
Você pode contribuir para o projeto seguindo os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para realizar suas modificações.
3. Faça as modificações desejadas.
4. Teste as modificações e verifique se estão funcionando corretamente.
5. Submeta um pull request com suas modificações.

## Autores

- Elise Flaneuse(https://github.com/eliseflaneuse)
- Camila Ramos (https://github.com/kmikazze)
-
-
- Leandro Andrade (https://github.com/leands0)

## Contato
Para entrar em contato com os desenvolvedores do projeto, envie um email para [eliseflaneuse@gmail.com](mailto:eliseflaneuse@gmail.com)





ou abra uma issue no repositório.
