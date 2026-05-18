package src;

public class Cachorro extends Pet {
       
    private String raca;
       
    public Cachorro(String nome, int idade, String tipo, Tutor tutor, String raca) {
        
        super(nome, idade, tipo, tutor);
        this.raca = raca;
        
        System.out.println("🐕 Característica de Cachorro adicionada!");
        System.out.println("   Raça: " + this.raca);
    }
    
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    public void latir() {
        System.out.println(getNome() + " está latindo: AU AU AU! 🐕");
    }
    
    public void buscarOsso() {
        System.out.println(getNome() + " foi buscar o osso! 🦴");
        setEnergia(getEnergia() - 5);
        System.out.println("   Energia após buscar: " + getEnergia());
    }
    
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();  
        System.out.println("   🐕 RAÇA ESPECÍFICA: " + raca);
    }
}