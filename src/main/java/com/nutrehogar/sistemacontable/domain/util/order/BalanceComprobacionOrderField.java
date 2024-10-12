package com.nutrehogar.sistemacontable.domain.util.order;


/**
 * Enum que define los campos por los cuales se puede ordenar el Balance de Comprobación.
 */
public enum BalanceComprobacionOrderField {
    FECHA("fecha"),
    TIPO_DOCUMENTO("tipo documento"),
    CODIGO_CUENTA("codigoCuenta"),
    NOMBRE_CUENTA("nombreCuenta"),
    REFERENCIA("referencia"),
    DEBE("debe"),
    HABER("haber");

    private final String fieldName;

    /**
     * Constructor de {@code BalanceComprobacionOrderField}.
     *
     * @param fieldName Nombre del campo en la entidad Cuenta.
     */
    BalanceComprobacionOrderField(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * Obtiene el nombre del campo correspondiente en la entidad.
     *
     * @return Nombre del campo.
     */
    public String getFieldName() {
        return fieldName;
    }
}