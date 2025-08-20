//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
       Area Circulo = new Circulo(5.0);
       Area Quadrado = new Quadrado(4.0);
       Area Triangulo = new Triangulo(6.0, 4.0);

       System.out.println("Circulo Area: " + Circulo.caucularArea());
       System.out.println("Quadrado Area: " + Quadrado.caucularArea());
       System.out.println("Triangulo Area: " + Triangulo.caucularArea());
    }
}