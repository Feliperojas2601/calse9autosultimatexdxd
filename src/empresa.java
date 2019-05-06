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
public class empresa {
     private HashMap <String,Autos> autos;
     public empresa(){
         this.autos = new HashMap<>();
     }
     public void registrarautos (Autos x){
         this.autos.put(x.getPlaca(),x);
}
     public HashMap mostrarautos (){
         return this.autos;
     }
}
