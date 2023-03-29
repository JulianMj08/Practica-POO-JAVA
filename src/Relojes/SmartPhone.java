package Relojes;

public class SmartPhone extends SmartDevice{

int almacenamiento;
int velocidad;

public SmartPhone(){

}

    public SmartPhone(String color, String modelo, String marca, boolean sport, int peso, boolean asistenteVoz, int duracionBateria, boolean correasIntercambiables, boolean pagosMoviles, boolean bluetooth, boolean monitorActividadFisica, boolean GPS, double calcularCaloriasPorMinuto, int almacenamiento, int velocidad) {
        super(color, modelo, marca, sport, peso, asistenteVoz, duracionBateria, correasIntercambiables, pagosMoviles, bluetooth, monitorActividadFisica, GPS, calcularCaloriasPorMinuto);
        this.almacenamiento = almacenamiento;
        this.velocidad = velocidad;
    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "almacenamiento=" + almacenamiento +
                ", velocidad=" + velocidad +
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


