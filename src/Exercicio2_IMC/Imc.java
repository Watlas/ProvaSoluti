package Exercicio2_IMC;

public class Imc {
    private float peso;
    private float altura;


    //Construtor default
    public Imc() {
    }
    public Imc(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularImc(float peso, float altura){
        return (float) (peso / (Math.pow(altura, 2)));
    }
}
