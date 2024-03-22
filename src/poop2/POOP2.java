/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop2;

/**
 * Programa para aprender sobre los fundamentos y sintaxis del lenguaje.
 * @author estudiante
 */
public class POOP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        System.out.println("Buitres Fac. Med.");
        System.out.println("############## if ##############");
        int a;
        a=10;
        /**
        * una vez que corremos el codigo y no hace nada esa variable te recomienda que lo quites
        */
        int b=5;
        if(a<b){
            System.out.println("a es menor que b");
        }else if(a==b){
            System.out.println("a y b son iguales");
        }else{
            System.out.println("b es menor que a");
            /**
            * operador comillas siempre van en pares, System. las opciones que se pueden realizar con la palabra
            * El operador punto entra al contenido o nos dice que podemos realizar
            */
            System.out.println(b+" es menor que "+a); 
        }
        if (menor(a,b)) {
            System.out.println("a es menor que b");
        }else{
            System.out.println("b es menor que a");
        }
        System.out.println("########### switch #############");
        char vocal = 'a';
            /**
            * //hay sensibilidad con las mayusculas
            */
        switch (vocal) { 
            case 'a':
                System.out.println("vocal a");
                break;
            case 'e':
                System.out.println("vocal e");
                break;
            case 'i':
                System.out.println("vocal i");
                break;
            case 'o':
                System.out.println("vocal o");
                break;
            case 'u':
                System.out.println("vocal u");
                break;
            default:
                throw new AssertionError();
        }        
        System.out.println("############ while ############");
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba: "+n);
            /**
            * n=n+1; forma primitiva
            * forma mas rapida de escribir
            */
            n++; 
        }
        System.out.println("Valor de n afuera de while: "+n);
        while (n>0) {
            System.out.println("Contando hacia abajo "+n);
            n--;
        }
        System.out.println("Valor de n afuera de while: "+n);
        
        System.out.println("########## do while ###########");
        do {
            System.out.println("Contando hacia abajo "+n);
            n--;
        } while (n>0);
        System.out.println("Valor de n afuera de while: "+n);
        
        System.out.println("############ for ###########");
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);
        }
        /**
        * System.out.println(i); i solo esta declarada dentro del for
        */
        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo "+i);
        }
        System.out.println("####### for con arreglos ########");
        int miArreglo[]={1,2,3,4,5};
        int numElementos = miArreglo.length;
        /**
        * los circulos son metodos
        */
        System.out.println("Mi arreglo tiene "+numElementos+" elementos");
        int[] miArreglo2= new int[11]; //sintaxis diferente a C
        for (int i = 0; i < 10; i++) {
            System.out.println("elemento: "+i+": "+miArreglo2[i]);
        }
        for (int i = 0; i < 10; i++) {
            miArreglo2[i]=i*10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("elemento: "+i+": "+miArreglo2[i]);
        }
        int[] miArreglo3= new int[15];
        for (int i = 0; i < miArreglo3.length; i++) {
            System.out.println("elemento: "+i+": "+miArreglo3[i]);
        }
        for (int i = 0; i < miArreglo3.length; i++) {
            miArreglo3[i]=i*10;
        }
        System.out.println("Hackeando la nasa...");
        for (int i = 0; i < miArreglo3.length; i++) {
            System.out.println("elemento: "+i+": "+miArreglo3[i]+"%");
        }
        System.out.println("############for each#########");
        for (int i : miArreglo3) {
            System.out.println("Elemento del arreglo "+i);
        }
        for(int temp : miArreglo3){
            System.out.println("Elemento del arreglo con foreach "+temp);
        }
                
}    
/**
* Funcion para determinar el valor menor{
* @param retorna si es verdadero o falso
*/
    private static boolean menor(int a, int b) {
    if(a<b){
        return true;
    }else{
        return false;
    }
    }
}
