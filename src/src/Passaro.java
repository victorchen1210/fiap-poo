package src;

// Passaro é uma subclasse de Pet (herança)
public class Passaro extends Pet {
    
    // ATRIBUTO EXCLUSIVO DE PÁSSARO
    private String corPena;
    
    // CONSTRUTOR
    public Passaro(String nome, int idade, String tipo, Tutor tutor, String corPena) {
        super(nome, idade, tipo, tutor);
        this.corPena = corPena;
        
        System.out.println("🐦 Característica de Pássaro adicionada!");
        System.out.println("   Cor da pena: " + this.corPena);
    }
    
    public String getCorPena() {
        return corPena;
    }
    
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void voar() {
        System.out.println(getNome() + " está voando! 🕊️");
        setEnergia(getEnergia() - 8);
        System.out.println("   Energia após voar: " + getEnergia());
    }
    
    // POLIMORFISMO - SOM DO PÁSSARO
    @Override
    public void emitirSom() {
        System.out.println("🐦 " + getNome() + " (Pássaro) canta: PIU PIU! Fiu fiu!");
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("   🐦 COR DA PENA: " + corPena);
    }
}