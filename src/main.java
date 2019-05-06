/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.HashMap;
/**
 *
 * @author Estudiante
 */
public class main {
    public static void main(String[] args) {
        empresa e1 = new empresa ();
        autolujo a1 = new autolujo (2,"RJX766",560,"Ferrari",2010,120000000);
        camioneta c1 = new camioneta (2100,2,5000,"RJY766",210,"Ford",2018,4000000);
        e1.registrarautos(c1);
        e1.registrarautos(a1);
        HashMap <String,Autos> auto = e1.mostrarautos();
        for (Autos y : auto.values()){
            System.out.println(y.getAnio());
            System.out.println("wow");
        }
        
    }
}
