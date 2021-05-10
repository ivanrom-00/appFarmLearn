/*
Clase ExpresionRegular
En esta clase se definen los métodos que se utilizan para realizazr los matches
de una cadena por medio de la clase Matcher de Java

Creado por: Iván Romero Canaán
 */
package AppGráfica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionRegular {

    public static boolean validar(String regex, String evaluar) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(evaluar);

        boolean coincidencia = m.find();
        return coincidencia;
    }

}
