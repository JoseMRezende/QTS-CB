# QTS-CB

## Descrição

Repositorio para teste Conta Bancária.</br>
Qualidade e Testes de Software - Análise e Desenvolvimento de Sistemas - FACENS

<div>
<img src="https://github.com/JoseMRezende/QTS-CB/assets/112033771/9aa2d0ea-f78a-4b99-a786-d3060dae4910" width="400px" />
</div>

## BDD

O Gherkin é uma linguagem de especificação usada principalmente em práticas de BDD (Behavior-Driven Development) e é projetada para ser legível tanto por seres humanos quanto por máquinas. É uma
linguagem de formatação simples que descreve o comportamento do software em termos de cenários.</br>
</br>
Requisito: Nome do requisito</br>
Descrição do recurso.</br>
</br>
Cenário: Nome do cenário</br>
Descrição do cenário.</br>
</br>
Given – dado um contexto;</br>
When – quando acontecer um evento;</br>
Then – então se espera que aconteça algo.</br>
Cenário: Outro nome do cenário.</br>

## Ambiente de Teste

O Cucumber é uma ferramenta de automação de testes e uma biblioteca que é amplamente utilizada em
práticas de BDD (Behavior-Driven Development). Ele permite que equipes de desenvolvimento e testes
criem testes automatizados com base em especificações escritas em linguagem natural, como Gherkin, e
verifica se o software se comporta de acordo com essas especificações.</br>

<div>
<img src="https://github.com/JoseMRezende/QTS-CB/assets/112033771/77f56bd9-0c69-4a30-84cd-93fa8ded851f" width="400px" />
</div>

O Cucumber utiliza "tags" que são rótulos que você pode associar a cenários ou características (features)
em suas especificações Gherkin. As tags ajudam a organizar e marcar os cenários, permitindo que você
execute apenas os cenários marcados com tags específicas. Isso é útil quando você deseja segmentar a
execução de testes com base em critérios específicos, como cenários de regressão, testes de aceitação,
entre outros.</br>


## Aplicação

Story: Cliente faz saque de dinheiro Como um cliente, eu gostaria de sacar dinheiro em caixa eletrônico,
para que eu não tenha que esperar numa fila de banco.</br>
</br>
Scenario: Cliente especial com saldo negativo.</br>
Given um cliente especial com saldo atual de -200 reais.</br>
When for solicitado um saque no valor de 100 reais.</br>
Then deve efetuar o saque e atualizar o saldo da conta para -300 reais.</br>
</br>
Scenario: Cliente comum com saldo negativo.</br>
Given um cliente comum com saldo atual de -300 reais.</br>
When solicitar um saque de 200 reais.</br>
Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente.</br>


## Ferramentas / Linguagens

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

## Imagens

### 1.
<div>
<img src="https://github.com/JoseMRezende/QTS-CB/assets/112033771/bdb77868-ac95-43c1-b506-66a75877398a" width="500px" />
</div>

### 2.
<div>
<img src="https://github.com/JoseMRezende/QTS-CB/assets/112033771/c6ee07cb-6fd6-49ec-b5a5-d26ff1d9e697" width="500px" />
</div>
