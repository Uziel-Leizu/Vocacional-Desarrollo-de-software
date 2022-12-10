package apprfc;

public class Persona {          //comentarios para la explicacion
    private String nombre;      //en cada uno de estas caracteristicas de la clase persona
    private String apellidoP;   //si te das cuenta tiene un modificado de acceso de tipo
    private String apellidoM;   //privado, esto hace que estas variables no puedan ser 
    private String fecha;       //modificadas de manera directa en la clase main, para
    private int anio;           //ello se tiene que utilizar unos metodos llamados setter
    private int mes;            //y getter, cada uno para distintas funciones
    private int dia;            //en este programa solo utilice setter para modificar 
                                //las variables desde mi main

    public void setNombre(String nombre) {      //esta es la forma en que se crea la funcion setter
        this.nombre = nombre;                   //aqui si te das cuenta tiene un this.nombre, esto es para que 
    }                                           //el compilador no se confunda con las variables del mismo
                                                //nombre que se encuentra inicializada dentro del parentesis
                                                //de la funcion setNombre que en este caso es nuestra funcion
                                                //setter, asi en todas las variables que permitamos 
                                                //modificar desde la clase main

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public String Rfc (){                   //esta es la accion que va a llevar a cabo la clase Persona
                                            //es donde se lleva a cabo la obtencion del RFC
        char primervocal = 'a';
        for(int i=1;i<apellidoP.length();i++){
            if(apellidoP.charAt(i)=='a' || apellidoP.charAt(i)=='e'|| apellidoP.charAt(i)=='i'|| apellidoP.charAt(i)=='o'|| apellidoP.charAt(i)=='u' ){
             primervocal = apellidoP.charAt(i);  //aqui es una forma que yo cree para obtener la 
             break;                              //primera vocal del apellido paterno, El orden de el RFC
            }                                    //lo habre dejado al inicio en la clase main
        }
     String rfc;//variable que almacenara el RFC
     rfc = ""+apellidoP.charAt(0)+""+primervocal+""+apellidoM.charAt(0)+""+nombre.charAt(0)+""+anio+""+mes+""+dia;
         //^aqui donde estan las comillas y en distintas partes a travez de esta linea de codigo son muy
         //importantes ya que hacen que podamos concatenar no solo variables string, sino tambien
         //enteros y cualquier otro tipo y lo guarde como un String unico, si no tubiera esas comillas
         //en compilador puede confundirse y mandar en vez de letras numeros, o al menos eso me paso 
         //al principio, fue hasta que vi en el pizarron como juntar las cadenas distintas usando
         //las comillas, se explica mejor en la foto que tomé al pizarron en la parte derecha que dice
         //ejemplos de concatenacion
     return rfc;
    }
    
    

}
