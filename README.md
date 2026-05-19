# Projeto FiapRide - [Seu Nome Completo]

## Informações do Aluno
- **Nome:** [Victor Chen]
- **RM:** [565363]
- **Turma:** [1ccph]
- **Curso:** [Ciencia da computacao]
- **GitHub:** [@victorchen1210]

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Progra
mação Orientada a Objetos, onde desenvolvemos o sistema **FiapRid
e** (aplicativo de mobilidade urbana).


---

## Checklist de Implementação

- [S] Aula 1 - Classes e Objetos
- [S] Aula 2 - Métodos
- [S] Aula 3 - Encapsulamento
- [S] Aula 4 - Construtores
- [S] Aula 5 - Associação
- [S] Aula 6 - Herança
- [S] Aula 7 - Polimorfismo
- [S] Aula 8 - Classes Abstratas
- [S] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** "**Pergunta:** Por que precisamos criar uma classe
`Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Cla
sse ajuda a resolver isso?"

**Sua Resposta:**
[Usar variáveis soltas funciona para poucos dados, mas quando temos muitos objetos (ex: 1 milhão de passageiros), fica impossível gerenciar. A classe resolve isso pois serve como um molde para criar quantos objetos precisarmos de forma organizada e com pouco código. Com 1 milhão de usuários, usar variáveis soltas significaria criar 1 milhão de variáveis diferentes (ex: nome1, nome2, nome3...). Isso é inviável. Com uma classe Passageiro, eu crio um array ou lista e uso um loop para criar todos em poucas linhas. A classe permite escalar o sistema sem multiplicar o código]

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo \+ 100` diretamente no código principal, porque dá tanto trabalho criar um método específico chamado `adicionarSaldo\(valor\)` para fazer isso? Quais seriam os riscos para anossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?"

**Sua Resposta:**
[Fazer direto no código funciona, mas é perigoso. Os riscos para a startup são: saldos negativos, fraudes, bugs espalhados e falta de controle. O método adicionarSaldo() centraliza a regra de negócio em um único lugar, impede valores inválidos e facilita a manutenção do sistema]

---

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo\(\)` e `getNome\(\)` são `public`. Por que éseguro deixar o `get` público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL para a pessoa rasurar? "

***Sua Resposta***
[O get é seguro porque ele entrega apenas uma CÓPIA do valor, não o original. O usuário pode ver o saldo, mas não pode alterá-lo. Já o atributo público entrega o ORIGINAL, permitindo que qualquer um modifique o valor de forma errada, como colocar saldo negativo. É como dar uma cópia de um documento (seguro) vs entregar o documento original para alguém rabiscar perigoso]

---

### Aula 4 - Construtores

**Pergunta:** "> "Na nossa classe `Veiculo`, nós tomamos duas dec
isões arquitetônicas muito importantes:

>
> 1. Nós **não** criamos o método `setModelo\(\)`.
> 2. O `setPlaca\(\)` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca\(\)` para acessá-lo.
>
> Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?"


_Dica: Pense sobre o que pode ou não mudar fisicamente em um carr
o, e a diferença entre "alterar um dado no banco" e "executar um
processo real no Detran"_"


**Sua Resposta:**
[Criar 'getters e setters para tudo' é um erro grave porque permite alterar atributos que não deveriam mudar no mundo real.
Sem setModelo(): Impede que o modelo do veículo seja trocado depois de criado, evitando fraudes.
setPlaca() privado: Força que a troca de placa passe por regras de negócio (como autorização do DETRAN), não sendo apenas uma alteração direta no banco de dados.
A lição é: nem tudo que é técnico (poder alterar) faz sentido no negócio (deveria alterar). Getters e Setters só devem existir para atributos que realmente podem ser lidos e alterados no mundo real]

---

### Aula 5 - Associação

**Pergunta:** ""No construtor da `Viagem`, nós exigimos o objetointeiro \(`Passageiro solicitante`\). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem \(`String nomeDoPassageiro`\) em vez do objeto todo?"

_Pense nas regras de negócio: O que acontece na hora que a Viagemacaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?

**Sua Resposta:**
[Não seria mais fácil passar só o nome, mas isso quebraria o sistema. Quando a viagem termina, precisamos descontar o saldo do passageiro. Se a Viagem tiver apenas o nome 'Ana Silva', ela não consegue alterar o saldo da Ana. Ela só tem uma String, não o objeto de verdade.
Com o objeto Passageiro inteiro, a Viagem consegue chamar métodos como descontarSaldo(), adicionarPontos(). A regra de negócio exige o objeto completo, não apenas alguns dados soltos.]


---


### Aula 6 - Herança

**Pergunta:** ""No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de`Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super\(\)` ou o `setPlaca\(\)`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?""

**Sua Resposta:**
[O Java não permite que a classe filha (Carro) altere diretamente os atributos privados da classe mãe (Veiculo) para proteger o princípio do encapsulamento (Aula 3).
Se a filha pudesse acessar diretamente this.placa, ela poderia colocar valores inválidos, pular regras de negócio e violar validações que estão na classe mãe. Obrigando a usar super() ou setters, o Java garante que as regras de validação definidas no construtor ou métodos da classe mãe sejam respeitadas, protegendo a integridade dos dados.]


---

### Aula 7 - Polimorfismo

**Pergunta:** "No nosso loop `for \(Veiculo veiculo : frota\)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia\(\)` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?"

**Sua Resposta:**
[Não conseguiríamos chamar o método porque o compilador Java só enxerga o tipo declarado da variável (Veiculo). Se o método não existe na classe mãe, o código nem compila, mesmo que as classes filhas tenham o método. O contrato precisa existir na base da hierarquia para garantir o polimorfismo: a variável genérica pode tratar qualquer filha de forma uniforme, pois todas herdam ou implementam aquele método]


---


### Aula 8 - Classes Abstratas

**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo\(\)` e quebrar a lógica do nosso sistema?"

**Sua Resposta:**
[Não. No mundo real, você não compra um "veículo" genérico. Você compra um carro, uma moto, um caminhão - um tipo específico.

Porque o Java não adivinha sua intenção. Para ele, Veiculo é uma classe normal como qualquer outra. Se você não colocar abstract, ela pode ser instanciada.

Alguém pode fazer new Veiculo() e criar um "veículo vazio", sem placa, sem modelo, sem autonomia - um objeto que não faz sentido no mundo real. Isso quebra a lógica do sistema, pois esse veículo genérico poderia entrar na frota, aparecer em relatórios, gerar viagens, mas não teria comportamento real]


---


### Aula 9 - Interfaces

**Pergunta:** "Por que Java permite herança simples \(apenas uma mãe\), mas múltipla implementação de interfaces \(vários contratos\)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo \(herança múltipla\), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar\(\)`?

Como as interfaces resolvem esse problema? "

**Sua Resposta:**
[Herança múltipla causa conflito: se duas classes mães têm o mesmo método, a filha não sabe qual usar.
Interface resolve porque só define o contrato (o que fazer), não a implementação (como fazer). Então não tem conflito.
Por isso Java permite herança simples (uma mãe) e múltiplas interfaces (vários contratos).]


## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**

[Meu pet, o projeto simula um ambiente onde pets tem tutores, podem brincar, passear, alimentar, e existem diferentes tipos de pets (cachorro, gato, passaro).]


**Quais classes você criou?**
 [Pet
 Cahorro
 Gato
 Passaro
 Tutor
 Main
 Brincavel]

**Qual foi o maior desafio técnico que você enfrentou?**
[Entender classes abstratas. No começo não entendia por que não podia criar new Pet(). Depois percebi que no mundo real não existe "pet genérico". A classe abstrata serve como molde e protege o sistema de objetos sem sentido. Resolvi transformando Pet em abstract e criando métodos abstratos como emitirSom()]

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**
[Aprendi os pilares da POO: classes, encapsulamento, herança, polimorfismo, abstração e interfaces. Também aprendi que organizar o código evita problemas no futuro.]

**Qual conceito foi mais difícil de entender?**
[Polimorfismo. Não entendia como uma variável podia ser do tipo Pet mas guardar um Cachorro. Superei testando na prática com o loop e vendo cada animal fazer seu próprio som]

**O que você melhoraria no seu projeto se pudesse refazer?**
[Adicionaria tratamento de erros com try-catch, salvaria os dados em banco de dados e faria uma interface gráfica com imagens]