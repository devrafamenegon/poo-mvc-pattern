# Exemplo de Aplicação com Padrão MVC em Java 🚀

Este é um projeto de exemplo que demonstra a implementação do padrão arquitetural Model-View-Controller (MVC) em Java. O objetivo deste projeto é ilustrar como separar as responsabilidades de uma aplicação em três componentes principais: Modelo, Visão e Controlador.

## Estrutura do Projeto 🏗️

O projeto está estruturado da seguinte forma:

- `controllers`: Pacote contendo as classes controladoras.
- `models`: Pacote contendo as classes que representam os modelos de dados.
- `views`: Pacote contendo as classes responsáveis pela apresentação dos dados ao usuário.
- `Main.java`: Arquivo principal que inicia a aplicação e demonstra o funcionamento do padrão MVC.
  
## Componentes do Padrão MVC 🧩

### Modelo (Model) 📦

A classe `Task` no pacote `models` representa o modelo de dados da aplicação. Ela contém os atributos e métodos relacionados às tarefas.

### Visão (View) 👁️

A classe `TaskView` no pacote `views` é responsável por apresentar os detalhes das tarefas ao usuário. Ela possui o método `printTaskDetails` para exibir as informações no console.

### Controlador (Controller) 🕹️

A classe `TaskController` no pacote `controllers` atua como intermediário entre o Modelo e a Visão. Ela recebe as interações do usuário, atualiza o Modelo conforme necessário e atualiza a Visão para refletir essas mudanças.

## Utilização 🚀

1. Clone este repositório: `git clone https://github.com/devrafamenegon/poo-mvc-pattern.git`
2. Navegue até o diretório do projeto: `cd poo-mvc-pattern`
3. Compile o código-fonte: `javac Main.java`
4. Execute o arquivo compilado: `java Main`

## Contribuição 🤝

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues para relatar problemas, sugerir novos recursos ou enviar pull requests com melhorias.

## Licença 📝

Este projeto é distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para obter mais detalhes.
