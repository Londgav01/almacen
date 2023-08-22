package co.uniquindio.almacen.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class GeneradorCodigo {
    private static Set<String> codigosGenerados = new HashSet<>();

    public static String generarCodigoUnico() {
        String codigo;
        do {
            codigo = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
        } while (codigosGenerados.contains(codigo));

        codigosGenerados.add(codigo);
        return codigo;
    }

}







