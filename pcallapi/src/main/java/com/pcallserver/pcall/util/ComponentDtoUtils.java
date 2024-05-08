package com.pcallserver.pcall.util;

/*
 * Los enums son pasados como Strings. Esta clase se encarga de
 * manejalos para que puedan ser utilizados como enums
 */
public class ComponentDtoUtils {

    // Comprueba si el String pasado por parámetro coincide con algún valor del enum
    public static <E extends Enum<E>> boolean isValid(Class<E> enumClass, String value) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    // Devuelve el valor del enum que coincida con el String pasado por parámetro
    public static <E extends Enum<E>> E getEnumValue(Class<E> enumClass, String value) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        return null;
    }
}
