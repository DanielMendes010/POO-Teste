public class TestaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("chevrolet", "omega", 2015, "preto", 1.0);
        Carro carro2 = new CarroAutomatico("citroen", "xcsara picasso", 2005, "preto", 2.0);
        Carro carro3 = new Carro("VW", "gol", 2000, "prata", 1.0);
        Carro carro4 = new Carro("fiat", "uno", 2008, "branco", 1.0);

        System.out.println("Carro 1: " + carro1);
        System.out.println("Carro 2: " + carro2);
        System.out.println("Carro 3: " + carro3);
        System.out.println("Carro 4: " + carro4);
    }
}
