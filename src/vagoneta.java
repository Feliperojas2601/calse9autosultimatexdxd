/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class vagoneta extends Autos {
     private int nupasajeros;

    public vagoneta(int nupasajeros, String placa, int serie, String marca, int anio, double precio) {
        super(placa, serie, marca, anio, precio);
        this.nupasajeros = nupasajeros;
    }

    public int getNupasajeros() {
        return nupasajeros;
    }

    public void setNupasajeros(int nupasajeros) {
        this.nupasajeros = nupasajeros;
    }
     
}
