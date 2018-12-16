
package aula02_exercicio;
public class Ventilador {
    String marca;
    String cor;
    String voltagem;
    Boolean ligado;
    Boolean girar;
    
    void status(){
         System.out.println("Marca: "+this.marca);
         System.out.println("Voltagem: "+this.voltagem);
         System.out.println("Cor: "+this.cor);
        System.out.println("Está ligado? "+this.ligado);
        System.out.println("Estou em modo giratório? "+this.girar);
        }
    void ligar(){
        this.ligado=true;
    }
    void desligar(){
        this.ligado=false;
    }
    void girar(){
        if(this.girar==true){
            System.out.println("Já está em modo giratório");
            
           }else{
            this.girar=true;
        }
    }
    void trancarGiro(){
         if(this.girar==false){
             System.out.println("Já está trancado o giro");
         }else{
        this.girar=false;
         }
    }
}
