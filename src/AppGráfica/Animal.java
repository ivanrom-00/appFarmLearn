/*
Clase Animal
En esta clase se establece el nombre del animal, una imagen representativa,
algunas pistas y sobre todo la expresión regular que será la utilizada para validar
la entrada del usuario

Creado por: Iván Romero Canaán
*/

package AppGráfica;

public class Animal {
    
    // Atributos
    private String nombre;
    private String regex;
    private String pista;
    
    // Constructores

    public Animal(String nombre, String regex, String pista) {
        this.nombre = nombre;
        this.regex = regex;
        this.pista = pista;
    }
    

    // Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }
    
    
    
}
