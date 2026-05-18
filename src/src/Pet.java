package src;

public class Pet {
    private String nome;
    private int idade;
    private String tipo;
    private int energia;
    private int fome;

    // CONSTRUTOR
    public Pet(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.energia = 100;
        this.fome = 0;
    }

 

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFome() {
        return fome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void setIdade(int idade) {
        
        if (idade < 0) {
            System.out.println("❌ ERRO: Idade não pode ser negativa! Mantendo idade anterior: " + this.idade);
        } else if (idade > 30) {
            System.out.println("❌ ERRO: Idade máxima permitida é 30 anos! Mantendo idade anterior: " + this.idade);
        } else {
            this.idade = idade;
            System.out.println("✅ Idade alterada para: " + this.idade);
        }
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public void setEnergia(int energia) {
        if (energia < 0) {
            System.out.println("❌ ERRO: Energia não pode ser negativa! Mantendo energia anterior: " + this.energia);
        } else if (energia > 100) {
            System.out.println("⚠️ ATENÇÃO: Energia não pode ultrapassar 100! Ajustando para 100.");
            this.energia = 100;
        } else {
            this.energia = energia;
        }
    }

    
    public void setFome(int fome) {
        if (fome < 0) {
            System.out.println("❌ ERRO: Fome não pode ser negativa! Mantendo fome anterior: " + this.fome);
        } else if (fome > 100) {
            System.out.println("⚠️ ATENÇÃO: Fome não pode ultrapassar 100! Ajustando para 100.");
            this.fome = 100;
        } else {
            this.fome = fome;
        }
    }

    
    public void brincar() {
        System.out.println(nome + " está brincando 🐾");
        setEnergia(energia - 10);
        setFome(fome + 5);
        System.out.println("   Energia: " + energia + " | Fome: " + fome);
    }

    public void dormir() {
        System.out.println(nome + " está dormindo 😴");
        setEnergia(100);
        System.out.println("   Energia recuperada: " + energia);
    }

    public void exibirInfo() {
        System.out.println("Pet: " + nome + " | Idade: " + idade + " | Tipo: " + tipo);
        System.out.println("   Energia: " + energia + " | Fome: " + fome);
    }

    public void alimentar(int quantidade) {
        System.out.println("\n--- Tentando alimentar " + nome + " com " + quantidade + " porções ---");
        
        if (quantidade <= 0) {
            System.out.println("❌ ERRO: Quantidade inválida! Use um número positivo.");
        } else if (quantidade > 3) {
            System.out.println("❌ ERRO: " + nome + " não pode comer " + quantidade + " porções! Máximo é 3.");
        } else {
            int novaFome = fome - (quantidade * 10);
            if (novaFome < 0) {
                novaFome = 0;
            }
            setFome(novaFome);
            System.out.println("✅ " + nome + " comeu " + quantidade + " porção(ões)!");
            System.out.println("   Fome agora: " + fome);
        }
    }

    public void passear(int tempo) {
        System.out.println("\n--- " + nome + " vai passear por " + tempo + " minutos ---");
        
        if (tempo <= 0) {
            System.out.println("❌ ERRO: Tempo inválido! Use um número positivo.");
        } else if (tempo > 60) {
            System.out.println("❌ ERRO: " + nome + " não pode passear " + tempo + " minutos! Máximo é 60.");
        } else if (energia < tempo) {
            System.out.println("❌ ERRO: " + nome + " está com pouca energia (" + energia + ") para passear " + tempo + " min.");
        } else {
            setEnergia(energia - tempo);
            setFome(fome + (tempo / 10));
            System.out.println("✅ " + nome + " aproveitou o passeio!");
            System.out.println("   Energia agora: " + energia + " | Fome agora: " + fome);
        }
    }
}