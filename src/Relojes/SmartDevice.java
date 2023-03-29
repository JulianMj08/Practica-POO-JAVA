package Relojes;

public class SmartDevice {

    // atributos
    protected String color;
    protected String modelo;
    protected String marca;
    protected boolean sport;
    protected int peso;
    protected boolean asistenteVoz;
    protected int duracionBateria;
    protected boolean correasIntercambiables;
    protected boolean pagosMoviles;
    protected boolean bluetooth;
    protected boolean monitorActividadFisica;
    protected boolean GPS;
    protected double calcularCaloriasPorMinuto;


    // Contructor
    public SmartDevice(){

    }

    public SmartDevice(String color, String modelo, String marca, boolean sport, int peso, boolean asistenteVoz, int duracionBateria, boolean correasIntercambiables, boolean pagosMoviles, boolean bluetooth, boolean monitorActividadFisica, boolean GPS, double calcularCaloriasPorMinuto) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.sport = sport;
        this.peso = peso;
        this.asistenteVoz = asistenteVoz;
        this.duracionBateria = duracionBateria;
        this.correasIntercambiables = correasIntercambiables;
        this.pagosMoviles = pagosMoviles;
        this.bluetooth = bluetooth;
        this.monitorActividadFisica = monitorActividadFisica;
        this.GPS = GPS;
        this.calcularCaloriasPorMinuto = calcularCaloriasPorMinuto;
    }

    // Metodos


     public static double calcularCaloriasPorMinuto(double pesoGramos, double intensidad){
         double caloriasPorminuto = 0.0175 * pesoGramos * intensidad;
         return caloriasPorminuto;

     }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "color='" + color + '\'' +
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




