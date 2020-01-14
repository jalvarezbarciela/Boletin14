
package bol14;

public class Bol14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ConversorTemperaturas obx1=new ConversorTemperaturas();
        try{
            obx1.centigradosAFharenheit(20);
        }catch(TemperaturaErradaExcepcion e){
            System.out.println("Erro "+e.getMessage());
        }
       try{
            obx1.centigradosAReamur(80);
        }catch(TemperaturaErradaExcepcion e1){
            System.out.println("Erro "+e1.getMessage());
        }
           
    }
    
}
