// Osmer David Cardona Mejia
// NC:202410050140
// Programa principal
public class Main 
{
    public static void main(String[] args)
    {
        Recursos recursos = new Recursos();

        //  primer método
        System.out.println(recursos.obtenerMensaje());

        // segundo método 
        int edadEstudiante = 21; 
        System.out.println(recursos.verificarEdad(edadEstudiante));

        //  tercer método
        int resultadoMultiplicacion = recursos.multiplicar(5,5); // Aqui seria para cambiar los valores 
        System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);

        //  cuarto método
        int numeroLimite = 10; // Aqui podemos hacer cambios
        System.out.println("Numeros del 1 al " + numeroLimite + ": " + recursos.listarNumeros(numeroLimite));
    }
}