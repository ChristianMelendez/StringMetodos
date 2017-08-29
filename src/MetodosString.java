/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class MetodosString {
    public static void main(String[]args){
        String cadena="Curso JAVA EXO";
        System.out.println(cadena.toLowerCase());//Convierte la cadena a minuscula
        System.out.println(cadena.replace("A", "e"));//Reemplaza el primer parametro por el segundo en la cadena
        System.out.println(cadena.indexOf("JA"));//Muestra el indice donde se encuentra el parametro pedido
        System.out.println(cadena.charAt(6));//Muestra el caracter que se encuentra en el indice indicado
        System.out.println(cadena.endsWith("EXO"));//Indica por True o False si la cadena termina con el parametro indicado
        System.out.println(cadena.toUpperCase());//Convierte la cadena a mayuscula
        System.out.println(cadena.equals("Curso JAVA EXO"));//Indice por True o False si el argumento pedido coincide con la cadena
        System.out.println(cadena.startsWith("Cursa"));////Indica por True o False si la cadena empieza con el parametro indicado
    }   
}
