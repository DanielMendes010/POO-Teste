public interface CambioAutomatico {
    default void cambioAutomatico(boolean pedalDeAcelerar) {
        if (pedalDeAcelerar) {
            Carro.acelerar();
        } else {
            Carro.freiar();
        }
    }
}
