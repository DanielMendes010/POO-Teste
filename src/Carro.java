public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double motor;

    public Carro(String marca, String modelo, int ano, String cor, double motor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
    }

    public String ligaCarro(){
        return "O carro está ligado";
    }

    public String desligaCarro(){
        return "O carro está desligado";
    }

    public static void acelerar(){
        int velocidade;
        int limite = 100;
        for (velocidade = 0; velocidade <= limite; velocidade++){
            System.out.println(velocidade);
        }
    }

    public static void freiar(){
        int velocidade;
        int limite = 100;
        for (velocidade = 0; velocidade == limite; velocidade--){
            System.out.println(velocidade);
        }
    }

    @Override
    public String toString() {
        return "Carro:\n" +
                "marca = " + marca + '\'' +
                ", modelo = " + modelo + '\'' +
                ", ano = " + ano +
                ", cor = " + cor + '\'' +
                ", motor = " + motor +
                '}';
    }
}
