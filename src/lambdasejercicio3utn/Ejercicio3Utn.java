
package lambdasejercicio3utn;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3Utn {
    
   public void cambiarMayuscula(){
       
    List<String>listaAntiguaJugadores = List.of ("pelé","cruyff","rossi","Maradona","Messi") ; 
     

     List<String>listaMayuscula = listaAntiguaJugadores
             .stream().map(jugador -> jugador.toUpperCase()).sorted().collect(Collectors.toList());
            
         
             
          listaMayuscula.forEach(System.out::println);
          
          
   
           
             
       
    }
     
}
