public class Cachorro extends Animal{

    public Cachorro(String nome){
         super(nome);
    }
    @Override
    public void fazerSom(){
        System.out.println("Late: Au au au!");
    }
    @Override
    public void comer(){
        System.out.println(nome + "Está comendo ração");
    }
}
