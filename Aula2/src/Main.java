public class Main {
    public static void main(String[] args) {
         Animal[] animal = new Animal[2];

         animal[0] = new Cachorro("Rex");
         animal[1] = new Gato("Charles");

         for(Animal animalItem : animal){
             animalItem.fazerSom();
             animalItem.comer();

             System.out.println("--------------");
         }
    }
}