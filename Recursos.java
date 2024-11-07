// Osmer David Cardona Mejia
// NC: 202410050140
// Clase Recursos
public class Recursos 
{

    // Primer método: Retorna un mensaje
    public String obtenerMensaje() 
    {
        return "Programacion Orientada a Objetos 2021";
    }

    // Segundo método: Este es para verificar si es mayor o menor de edad
    public String verificarEdad(int edad)
    {
        if (edad >= 21)
        {
            return "Mayor de edad";
        }
        else 
        {
            return "Menor de edad";
        }
    }

    // Tercer método: Este seria para la multiplicación de dos numeros enteros
    public int multiplicar(int a, int b) 
    {
        return a * b;
    }

    // Cuarto método: Retorna una lista de números del 1 al X
    public String listarNumeros(int x) 
    {
        StringBuilder lista = new StringBuilder();
        for (int i = 1; i <= x; i++) 
        {
            lista.append(i).append(" ");
        }
        return lista.toString().trim();
    }
}