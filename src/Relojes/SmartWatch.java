package Relojes;

public class SmartWatch extends SmartDevice{

boolean personlizarPantalla;
boolean notificadorPantalla;

public SmartWatch(){

}

    public SmartWatch(String color, String modelo, String marca, boolean sport, int peso, boolean asistenteVoz, int duracionBateria, boolean correasIntercambiables, boolean pagosMoviles, boolean bluetooth, boolean monitorActividadFisica, boolean GPS, double calcularCaloriasPorMinuto, boolean personlizarPantalla, boolean notificadorPantalla) {
        super(color, modelo, marca, sport, peso, asistenteVoz, duracionBateria, correasIntercambiables, pagosMoviles, bluetooth, monitorActividadFisica, GPS, calcularCaloriasPorMinuto);
        this.personlizarPantalla = personlizarPantalla;
        this.notificadorPantalla = notificadorPantalla;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "personlizarPantalla=" + personlizarPantalla +
                ", notificadorPantalla=" + notificadorPantalla +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", sport=" + sport +
                ", peso=" + peso +
                ", asistenteVoz=" + asistenteVoz +
                ", duracionBateria=" + duracionBateria +
                ", correasIntercambiables=" + correasIntercambiables +
                ", pagosMoviles=" + pagosMoviles +
                ", bluetooth=" + bluetooth +
                ", monitorActividadFisica=" + monitorActividadFisica +
                ", GPS=" + GPS +
                ", calcularCaloriasPorMinuto=" + calcularCaloriasPorMinuto +
                '}';
    }
}
