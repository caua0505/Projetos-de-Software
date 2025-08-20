public class Circulo extends Area {
    private double raio;
    public Circulo(double raio){
        this.raio = raio;
    }
    @Override
    public double caucularArea(){
        return Math.PI * raio * raio;
    }

}
