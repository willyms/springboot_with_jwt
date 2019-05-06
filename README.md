# spring_with_jwt
### Sobre
Esse projeto é um demonstração  que servirá com base para aplicações de Spring boot  REST Security com JWT  (JSON Web Token).

### JSON Web Token
>JSON Web Tokens são um método RFC 7519 padrão da indústria aberto para representar reivindicações com segurança entre duas partes. para mais informações, confira [https://jwt.io/](https://jwt.io/
)

## Pré requisito
* Gradle 5
* Java 8
## Preparando ambiente
### Plugin Eclipse
 ```$
 # cd spring_with_jwt
 # gradle clean cleanEclipse
 # gradle clean eclipse
```
### Instalar o [Lombok]([https://projectlombok.org/](https://projectlombok.org/))
>O Lombok é usado para reduzir o código clichê para objetos de modelo / dados, por exemplo, ele pode gerar getters e setters para esses objetos automaticamente usando anotações do Lombok. A maneira mais fácil é usar a anotação @Data. 

Com o comando abaixo vamos adicionar a dependência do Lombok ao classpath e instalar no  Eclipse IDE.
```$
 # cd spring_with_jwt
 # gradle installLombok
```
Para saber mais somente  o Lombok clique [aqui]([https://github.com/franzbecker/gradle-lombok](https://github.com/franzbecker/gradle-lombok)) ou [aqui]([https://medium.com/@tsuyoshiushio/gradle-5-0-with-lombok-and-spring-boot-e8ca564fc552](https://medium.com/@tsuyoshiushio/gradle-5-0-with-lombok-and-spring-boot-e8ca564fc552)).

## Executando
Com tudo pronto, vamos executar o comando `gradle clean bootRun`  e a aplicação estará rodando na endereço [http://localhost:8080](http://localhost:8080/).

Existe uma conta de usuário presentes para demonstrar :

    {
    	"username":"admin",
    	"password":"password"
    }

Para nos autenticarmos corretamente, vamos uma requisição do tipo Post para o endereço http://localhost:8080/login com as credencias do nosso usuário default no body. Usando o [Postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop) a requisição feita com sucesso deve se parecer com isso:

[image01]

No header da resposta dessa requisição temos nosso token com o prefixo Bearer. Agora que temos o token vamos fazer uma requisição do tipo GET para o endereço [http://localhost:8080/hi_man](http://localhost:8080/hi_man) e no header da requisição nosso token incluindo o cabeçalho Authorization com o JWT que recebemos quando realizamos a autenticação com sucesso.

[image02]