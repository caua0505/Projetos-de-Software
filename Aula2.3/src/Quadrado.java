public class Quadrado extends Area {
    private double lado;

    public Quadrado (double lado){
        this.lado = lado;
    }

    @Override
    public double caucularArea(){
        return  lado * lado;
    }
}
