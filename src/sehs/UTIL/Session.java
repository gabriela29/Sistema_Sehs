package sehs.UTIL;

import java.util.HashMap;
import java.util.Map;

public final class Session {//final significa que no se puede heredar
//atributo
    static Map<String, Object> datos; //en un mapa los datos se guardan con valor 
    private Session() {
    }
 
     static {
        datos = new HashMap<>();//esto es para crear la clase mapa
    }
//metodo put no nos devuelve nada pero al llmar al metodo put 
    public static void put(String key, Object value) {
        datos.put(key, value);
    }

    public static Object get(String key) {//para obtner datos de la coleccion pero con clave
        return datos.get(key);
    }

}
