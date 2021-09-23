
package venta.autos;

/**
 * @author Alex Córdova
 * Fecha de creación: Mayo 26 de 2020
 * Fecha de modificación: 28 de Mayo de 2020
 * Programa para almacenar automóviles
 */

//Clase que contiene atributos de las asignaturas y el metodo constructor.
public class Auto {
    public String marca, modelo, tipo;
    public float valorComercial, valorFinal;
    public int identificador;

    public Auto(String marca, String modelo, String tipo, float valorComercial, float valorFinal, int identificador) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.valorComercial = valorComercial;
        this.valorFinal = valorFinal;
        this.identificador = identificador;
    }
    
    public String toString(){
        return "\nMarca: "+marca+"\nModelo: "+modelo+ "\nTipo: "+tipo+
        "\nValor comercial: "+valorComercial+"\nValor final: "+valorFinal+"\nId: "+identificador;
    }
    
}
