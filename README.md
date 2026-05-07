# Projeto Spring Boot - Turma 11 - Zero ao Fullstack

## 📖 Sobre o Projeto

Este é um **projeto introdutório de Spring Boot** desenvolvido para a **Turma 11 do programa Zero ao Fullstack** da **Treina Recife**. O projeto foi criado como uma ponte entre o módulo de **Programação Orientada a Objetos (POO)** e o vasto universo do desenvolvimento web com Spring Boot.

O objetivo é demonstrar os conceitos fundamentais do Spring Boot, como:
- **Arquitetura MVC** (Model-View-Controller)
- **Injeção de Dependência** (Dependency Injection)
- **REST API**
- **Separation of Concerns** (aplicando conceitos de POO)
- **Padrão de Serviço** (Service Layer)

## 🛠️ Tecnologias Utilizadas

- **Java 17** - Linguagem de programação
- **Spring Boot 4.0.6** - Framework web
- **Spring Web MVC** - Para criar APIs REST
- **Maven** - Gerenciador de dependências e build
- **Swagger/OpenAPI** - Documentação automática da API (springdoc-openapi)

## 📁 Estrutura do Projeto

```
projeto/
├── src/
│   ├── main/
│   │   ├── java/com/poo/treinarecife/projeto/
│   │   │   ├── ProjetoApplication.java          # Classe principal que inicia a aplicação
│   │   │   ├── controller/                       # Controllers - Recebem requisições HTTP
│   │   │   │   ├── ProjetoController.java
│   │   │   │   ├── TarefaController.java
│   │   │   │   ├── UsuarioController.java
│   │   │   │   └── TesteController.java
│   │   │   ├── model/                            # Models - Classes de domínio (Entidades)
│   │   │   │   ├── Projeto.java
│   │   │   │   ├── Tarefa.java
│   │   │   │   ├── Usuario.java
│   │   │   │   ├── Prioridade.java               # Enum
│   │   │   │   ├── StatusProjeto.java            # Enum
│   │   │   │   ├── StatusTarefa.java             # Enum
│   │   │   │   ├── StatusUsuario.java            # Enum
│   │   │   │   └── dto/
│   │   │   │       └── UsuarioDTO.java           # Data Transfer Object
│   │   │   └── service/                          # Services - Lógica de negócio
│   │   │       ├── ProjetoService.java
│   │   │       ├── TarefaService.java
│   │   │       ├── UsuarioService.java
│   │   │       └── interfaces/
│   │   │           └── CrudInterface.java        # Interface com operações CRUD
│   │   └── resources/
│   │       ├── application.properties            # Configurações da aplicação
│   │       ├── static/                           # Arquivos estáticos (CSS, JS, imagens)
│   │       └── templates/                        # Templates HTML (se usar Thymeleaf)
│   └── test/
│       └── ProjetoApplicationTests.java          # Testes unitários
├── pom.xml                                        # Configuração Maven
├── mvnw / mvnw.cmd                                # Maven Wrapper
└── README.md                                      # Este arquivo
```

## 🏗️ Arquitetura e Conceitos

### Padrão MVC (Model-View-Controller)

O projeto segue o padrão **MVC**, que organiza a aplicação em três camadas:

#### 1. **Controller (Controlador)**
- Recebe as requisições HTTP dos clientes
- Processa as solicitações
- Chama a camada de serviço para executar a lógica de negócio
- Retorna a resposta (geralmente em JSON)

Exemplo:
```java
@RestController
@RequestMapping("/projeto")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;
    
    @GetMapping
    public Projeto obter(){
        return projetoService.obter();
    }
}
```

#### 2. **Service (Serviço)**
- Contém a lógica de negócio
- Implementa as regras da aplicação
- Comunica-se com os repositórios (no caso atual, em memória)
- Implementa a interface `CrudInterface` para operações padrão

#### 3. **Model (Modelo)**
- Representa as entidades do domínio
- Contém os atributos e construtores
- Equivale às classes que vocês criaram em POO
- DTOs (Data Transfer Objects) são usados para transferir dados entre camadas

### Injeção de Dependência

O Spring oferece **Injeção de Dependência (DI)** através da anotação `@Autowired`:

```java
@Autowired
private ProjetoService projetoService;
```

Isso elimina a necessidade de criar instâncias manualmente, deixando o Spring gerenciar as dependências.

## 🚀 Como Executar o Projeto

### Pré-requisitos
- Java 17 ou superior instalado
- Maven instalado (ou use o Maven Wrapper incluído)

### Passos

1. **Clone ou extraia o projeto:**
   ```bash
   cd poo-turma-11-treina-recife
   ```

2. **Compile e inicie a aplicação:**

   Com Maven instalado:
   ```bash
   mvn spring-boot:run
   ```

   Ou usando o Maven Wrapper (Windows):
   ```bash
   mvnw.cmd spring-boot:run
   ```

   Ou usando o Maven Wrapper (Linux/Mac):
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Acesse a aplicação:**
   - URL base: `http://localhost:8080`
   - Documentação Swagger: `http://localhost:8080/swagger-ui.html`

## 📡 Endpoints Disponíveis

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/projeto` | Obtém informações do projeto |
| GET | `/tarefa` | Lista tarefas |
| GET | `/usuario` | Lista usuários |
| GET | `/teste` | Endpoint de teste |

## 📚 Conceitos de Spring Boot Introduzidos

### 1. **Anotações Spring**

- `@SpringBootApplication` - Marca a classe principal da aplicação
- `@RestController` - Indica que a classe é um controlador REST
- `@Service` - Marca uma classe como serviço
- `@Autowired` - Injeção automática de dependência
- `@RequestMapping` - Mapeia requisições HTTP para métodos
- `@GetMapping`, `@PostMapping`, etc. - Mapeiam requisições específicas

### 2. **REST API**

A aplicação expõe uma **REST API**, permitindo comunicação via HTTP usando padrões RESTful.

### 3. **Aplicação Standalone**

Ao contrário de aplicações web tradicionais que precisam ser deployadas em servidores, Spring Boot cria uma **aplicação standalone** que pode ser executada diretamente.

### 4. **Autoconfiguration**

O Spring Boot **automaticamente configura** componentes baseado nas dependências no classpath, reduzindo a necessidade de configuração manual.

## 📖 Relação com POO

Este projeto reforça os conceitos de **Programação Orientada a Objetos**:

- **Classes e Objetos**: Projeto, Tarefa, Usuario são classes com atributos e métodos
- **Interfaces**: `CrudInterface` define um contrato que os serviços implementam
- **Encapsulamento**: Cada camada tem responsabilidades bem definidas
- **Polimorfismo**: Services implementam a interface CRUD
- **Herança**: Classes podem herdar e estender funcionalidades

## 🎓 Próximos Passos

Depois de compreender este projeto básico, você pode explorar:

1. **Banco de Dados**
   - Integrar JPA/Hibernate
   - Usar Spring Data para operações de persistência

2. **Autenticação e Segurança**
   - Implementar Spring Security
   - JWT (JSON Web Tokens)

3. **Validação**
   - Bean Validation com `@Valid`
   - Mensagens de erro customizadas

4. **Testes Unitários**
   - Escrever testes com JUnit 5
   - Mockar dependências

5. **Logging**
   - Adicionar SLF4J e Logback
   - Registrar eventos importantes

6. **Tratamento de Exceções**
   - Exception Handlers
   - Custom Exceptions

7. **Documentação da API**
   - Aprimorar a documentação Swagger
   - Adicionar exemplos de requisição/resposta

## 🔗 Recursos Úteis

- [Documentação Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Boot Guides](https://spring.io/guides)
- [Swagger/OpenAPI Documentation](https://swagger.io/)
- [Java 17 Documentation](https://docs.oracle.com/en/java/javase/17/)

## 📝 Notas Importantes

- Este é um projeto **introductório** para aprendizado
- Os dados atualmente são armazenados em **memória** (não persiste após reinicialização)
- A estrutura é **simplificada** para fins educacionais
- Produção requer adições como banco de dados, tratamento de erros robusto e autenticação

## 🤝 Contribuição

Como este é um projeto educacional, modificações e melhorias são encorajadas como forma de aprendizado!

---

**Desenvolvido para a Turma 11 - Zero ao Fullstack - Treina Recife**

Última atualização: Maio de 2026
