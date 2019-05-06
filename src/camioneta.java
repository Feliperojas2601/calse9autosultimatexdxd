/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class camioneta extends Autos {
    private int capacidadcarga;
    private int cantidadejes;
    private int  rodadas;

    public camioneta(int capacidadcarga, int cantidadejes, int rodadas, String placa, int serie, String marca, int anio, double precio) {
        super(placa, serie, marca, anio, precio);
        this.capacidadcarga = capacidadcarga;
        this.cantidadejes = cantidadejes;
        this.rodadas = rodadas;
    }

    public int getCapacidadcarga() {
        return capacidadcarga;
    }

    public void setCapacidadcarga(int capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }

    public int getCantidadejes() {
        return cantidadejes;
    }

    public void setCantidadejes(int cantidadejes) {
        this.cantidadejes = cantidadejes;
    }

    public int getRodadas() {
        return rodadas;
    }

    public void setRodadas(int rodadas) {
        this.rodadas = rodadas;
    }
    
}
