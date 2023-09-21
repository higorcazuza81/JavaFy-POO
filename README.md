# Projeto Desafio de Programação Orientada a Objetos com Java

Este projeto é um desafio do curso de Programação Orientada a Objetos com Java da Alura. Ele simula um player de música e podcast com funcionalidades de classificação.

## Índice

1. [Visão Geral](#visão-geral)
2. [Principais Destaques de Conceito e Metodologia Aplicada](#principais-destaques-de-conceito-e-metodologia-aplicada)
    - [Abstração](#abstração)
    - [Pacotes](#pacotes)
    - [Encapsulamento](#encapsulamento)
    - [Construtores](#construtores)
    - [Métodos Getters e Setters](#métodos-getters-e-setters)
    - [Herança](#herança)
    - [Campos](#campos)
    - [Interface e Implementação](#interface-e-implementação)
    - [Polimorfismo](#polimorfismo)
    - [Imports](#imports)
    - [Criação de Instâncias e Chamadas de Método](#criação-de-instâncias-e-chamadas-de-método)
    - [Boas Práticas de Nomeação](#boas-práticas-de-nomeação)
    - [Clareza de Saídas, Testes e Comentários](#clareza-de-saídas-testes-e-comentários)
    - [Design e Manutenção de Código](#design-e-manutenção-de-código)
3. [Conclusão](#conclusão)
4. [Contribuições](#contribuições)
5. [Licença](#licença)

## 1. Visão Geral

O projeto consiste em classes que representam diferentes tipos de áudios, como músicas e podcasts. Cada áudio possui atributos específicos, como título, duração e classificação. Além disso, a aplicação da interface Classification permite a classificação dos áudios com base em critérios definidos.

## 2. Principais Destaques de Conceito e Metodologia Aplicada

## Abstração

A habilidade de abstração é crucial na construção de software robusto e escalável. Ao utilizar a Programação Orientada a Objetos (POO), conseguimos modelar entidades complexas de forma simplificada. No nosso projeto, vemos como diferentes tipos de áudios (músicas e podcasts) podem herdar características e comportamentos em comum de uma classe mãe abstrata (`Audio`). Isso não apenas facilita o desenvolvimento, mas também torna o código mais fácil de entender e dar manutenção.

```java
public abstract class Audio {
    // 
} 
```

## Pacotes

A organização em pacotes foi adotada para manter o código bem estruturado e modular. Isso facilita a compreensão e manutenção do projeto, permitindo a separação lógica das funcionalidades.

```java
package com.javafy.www.model;
```

## Encapsulamento

O encapsulamento foi aplicado ao definir os atributos das classes como privados e fornecer métodos getters e setters para acessá-los. Isso garante a integridade dos dados e previne acessos não autorizados.

```java
public class Music extends Audio implements Classification {
    //
    public int getDuration() {
    return duration;
}

public void setDuration(int duration) {
    if (duration >= 0) {
        this.duration = duration;
    } else {
        System.out.println("Duration cannot be negative.");
    }
}
    //
}
```

## Construtores

A correta utilização de construtores é essencial para a inicialização adequada dos objetos. Na classe Music, observamos dois construtores bem definidos. O primeiro, sem parâmetros, inicializa todos os campos com valores padrão, enquanto o segundo, parametrizado, permite a criação de uma instância com valores específicos. Esta prática não apenas torna o código mais legível, mas também proporciona uma forma intuitiva de criar novos objetos.

```java
public class Music extends Audio implements Classification {
    //
    public Music() {
        super();
        // ...
    }

    public Music(String title, int duration, String artist, String album, String genre) {
        super(title, duration);
        // ...
    }
}
```

## Métodos Getters e Setters

Os métodos getters e setters são essenciais para acessar e modificar os atributos de forma controlada. Eles garantem que as operações de leitura e escrita ocorram de maneira segura.

```java
public abstract class Audio {
    //
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be null or empty.");
        }
    }
    //...
}
```

## Herança e Modificadores de Acesso

A utilização eficaz de herança permite a reutilização de código e a especialização de comportamentos. Neste projeto, vemos como as classes Music e Podcast estendem a classe abstrata Audio, compartilhando características comuns. Além disso, o uso de modificadores de acesso apropriados (como private, protected e public) contribui para a segurança e a proteção dos componentes essenciais do código.

```java
public class Music extends Audio implements Classification {
    // ...
}

public class Podcast extends Audio implements Classification {
    // ...
}
```

## Campos

Os campos representam os atributos que armazenam informações sobre o áudio. Eles são cuidadosamente definidos para refletir as características de cada tipo de áudio.

```java
public abstract class Audio {
    //...
}
private String title;
private int duration;
// ...
```

## Interface e Implementação

A interface Classification foi criada para garantir a presença do método getClassification em todas as classes que a implementam. Isso promove a implementação de contratos e facilita a manutenção do código.

```java
public interface Classification {
    
public int getClassification();
}
```
## Polimorfismo

O método theBest foi implementado de forma polimórfica nas classes Music e Podcast. Isso permite que diferentes tipos de objetos forneçam uma classificação com base em critérios específicos.

```java
public class TheBest {

    public void theBest(Classification classification) {
        if (classification.getClassification() > 3) {
            System.out.println("This is one the best!");
        } else {
            System.out.println("This is one hit!");
        }
    }
}
```

## Imports

Os imports foram organizados de forma limpa e sem duplicações, seguindo as melhores práticas de organização de código.

```java
import classification.Classification;
import com.javafy.www.model.Audio;
// ...
```

## Criação de Instâncias e Chamadas de Método

No Main, instâncias das classes Music e Podcast são criadas e seus métodos são chamados para demonstrar o funcionamento do sistema.

```java
public class Main {
    Music motherMother = new Music("Mother", 3, "Danzing", "Punk", "Rock");
    motherMother.showTechnicalSheet();
}
```

## Boas Práticas de Nomeação

Todos os elementos foram nomeados de forma clara e descritiva, seguindo as convenções de nomenclatura Java. Isso torna o código mais legível e fácil de entender.


## Clareza de Saídas, Testes e Comentários

A saída no console foi formatada de forma clara e informativa. Foram realizados testes para verificar o funcionamento do sistema. Comentários explicativos foram adicionados para fornecer informações adicionais sobre o código.

## Design e Manutenção de Código

A aplicação de princípios de POO resulta em um código mais organizado e de fácil manutenção. A distribuição por classes e a utilização adequada de modificadores de acesso facilitam a colaboração em equipe, permitindo que diferentes desenvolvedores trabalhem de forma simultânea e segura em diferentes partes do projeto. Isso elimina a necessidade de copiar e colar código, promovendo uma estrutura de código mais coesa e legível.

##  3. Conclusão

A Programação Orientada a Objetos não é apenas uma técnica de programação, mas uma filosofia que promove a organização e a escalabilidade do código. Ao aplicar os princípios de abstração, herança, encapsulamento e polimorfismo, conseguimos criar sistemas mais robustos e flexíveis.

No nosso projeto, isso se traduz em um player de áudio intuitivo e de fácil manutenção. A estrutura bem definida e a clareza na organização do código facilitam a adição de novos recursos e tipos de áudios no futuro.

##  4. Contribuições 

Contribuições e feedback são bem-vindos! Se deseja contribuir com melhorias ou correções, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## 5. Licença

Este projeto é de autoria de Higor Cazuza e está disponível sob a Licença MIT.


<br><br>



Higor Cazuza<br>
Github: [@higorcazuza81]<br>
Autor do projeto

Janaína Cazuza<br>
Github: [@janainacazuza]<br>
Coautora do projeto

[@higorcazuza81]: https://github.com/higorcazuza81
[@janainacazuza]: https://github.com/janainacazuza



