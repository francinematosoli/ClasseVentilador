
package aula02_exercicio;


public class Aula02_exercicio {

    public static void main(String[] args) {
       Ventilador v1= new Ventilador();
       v1.marca="Arno";
       v1.cor="Cinza";
       v1.ligado=false;
       v1.voltagem="220v";
       
      v1.ligar();
      v1.desligar();
      v1.trancarGiro();
     v1.status();
      
    }
    
}
