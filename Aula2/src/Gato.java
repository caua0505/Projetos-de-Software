public class Gato extends Animal{
     public Gato(String nome){
         super(nome);
     }
     @Override
     public void fazerSom(){
         System.out.println(nome + "Diz: Miau miau!");
     }
     @Override
     public void comer(){
         System.out.println(nome + " Está comendo ração de gato");
     }
}
