
import javax.swing.JOptionPane;
public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int division;
    int multiplicar;
    
    //primer metodo pdir valores
    
    
    public void LeerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1 : "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2 : "));
    }
    public void sumar(){
        suma=numero1+numero2;  
    }
    public void restar(){
        resta=numero1-numero2;  
    }
    public void dividir(){
        division =numero1/numero2;  
    }
    public void multiplicar(){
        multiplicar=numero1*numero2;  
    }
    public void mostrarresultados(){
        System.out.println("la suma entre "+numero1+" y "+numero2+" es: "+suma);
        System.out.println("la resta entre "+numero1+" y "+numero2+" es: "+resta);
        System.out.println("la division entre "+numero1+" y "+numero2+" es: "+division);
        System.out.println("la multiplicar entrte "+numero1+" y "+numero2+" es: "+multiplicar);
    }
}
