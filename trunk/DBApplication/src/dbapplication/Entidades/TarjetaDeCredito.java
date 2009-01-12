/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;


/**
 * Menejo de información sobre pagos con TDC
 * @author prometheus
 */
public class TarjetaDeCredito extends FormaDePago {
    private String numero;
    private String banco;
    private int pinSeguridad;

    /**
     * Constructor por defecto
     */
    public TarjetaDeCredito () {
        super();
        this.banco = null;
        this.numero = null;
    }

    /**
     * Constructor con Parámetros
     * @param id id pago
     * @param pin pin tdc
     * @param num numero de la TDC
     * @param bank banco emisor
     */
    public TarjetaDeCredito (int id, int pin, String num, String bank) {
        super (id);
        this.banco = bank;
        this.numero = num;
        this.pinSeguridad = pin;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
    }

    /**
     * @return the pinSeguridad
     */
    public int getPinSeguridad() {
        return pinSeguridad;
    }

    /**
     * @param pinSeguridad the pinSeguridad to set
     */
    public void setPinSeguridad(int pinSeguridad) {
        this.pinSeguridad = pinSeguridad;
    }
}
