/*
Calcular la nota final de un estudiante
 */
package ejercicio5;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio5 {
    
    private double nota1, nota2, nota3, nota4, nota5; 

    public void cargarDatos(){
	Scanner entrada=new Scanner(System.in);
		
	System.out.println("Digite nota de Quices... ");
	nota1=entrada.nextDouble();
	
	System.out.println("Digite nota de Laboratorios... ");
	nota2=entrada.nextDouble();
		
	System.out.println("Digite nota Exposiciones... ");
	nota3=entrada.nextDouble();
		
	System.out.println("Digite nota Proyecto 1... ");
	nota4=entrada.nextDouble();
		
	System.out.println("Digite nota Proyecto Final... ");
	nota5=entrada.nextDouble();
		
	}
    
    public void notaDefinitiva(){
        
        double definitiva=(nota1*0.20+nota2*0.30+nota3*0.10+nota4*0.15+nota5*0.25);   
        
        System.out.println("Nota definitiva  "+definitiva);
        
        if(definitiva<=1){            
            System.out.println("Estas en el lugar equivocado");           
        }
        
            else if(definitiva<=2){                    
                System.out.println("Remal");                    
            }
        
            else if(definitiva<=3){
                System.out.println("Es posible recuperarse");               
            }
        
            else if(definitiva<=4){
                System.out.println("Normalito");
            }
        
            else if(definitiva<=4.5){
                System.out.println("Muy Bien");                
            }
        
            else{
                System.out.println("Excelente estudiante");                
            }        
    }    
}
