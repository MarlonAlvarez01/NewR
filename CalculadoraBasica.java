
public class CalculadoraBasica {
    public static void main(String[] args) {
        Operacion calcula = new Operacion();
        
        calcula.LeerNumeros();
        calcula.sumar();
        calcula.restar();
        calcula.dividir();
        calcula.multiplicar();
        calcula.mostrarresultados();
        
    }
}
