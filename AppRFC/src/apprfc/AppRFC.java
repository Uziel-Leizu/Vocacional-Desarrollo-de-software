package apprfc;
import java.util.Scanner;

//esta es la clase main del programa para obtener el RFC de una persona
//el orden de los datos es: 
//primera letra apellido paterno
//primera vocal apellido paterno
//primera letra apellido materno
//año de nacimiento
//mes de nacimiento
//día de nacimiento

public class AppRFC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona P = new Persona();
        System.out.println("Bienvenido al programa praa obtener tu RFC"); 
        System.out.println("Ingrese su apellido paterno: ");
        P.setApellidoP(in.nextLine());          //aqui asi como abajo en los demas escaneres
                                                //se esta llamando a la funcion seter del
                                                //objeto P de tipo persona
                                                //y esta mandando datos con el metodo
                                                //setter a las variables de la clase persona
                                                //ya que no podemos modificar
                                                //de forma directa a las variables de esa
                                                //clase debido a que tiene un modificador
                                                //de acceso de tipo privado
        System.out.println("Ingrese su apellido materno: ");
        P.setApellidoM(in.nextLine());
        System.out.println("Ingrese su nombre: ");
        P.setNombre(in.nextLine());
        System.out.println("Ingrese su año de nacimiento: ");
        P.setAnio(in.nextInt());
        System.out.println("Ingrese su mes de nacimiento: ");
        P.setMes(in.nextInt());
        System.out.println("Ingrese su dia de nacimiento: ");
        P.setDia(in.nextInt());
        
        System.out.println(P.Rfc());
        
    }

}
