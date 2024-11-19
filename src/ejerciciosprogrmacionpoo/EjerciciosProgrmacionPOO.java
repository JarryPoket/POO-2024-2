package ejerciciosprogrmacionpoo;
import java.util.*;
/**
 *
 * @author Santiago Navarro
 */
public class EjerciciosProgrmacionPOO {

    public static void main(String[] args) {
//Ejercicio 1: Escribir un programa que imprima “Hola”.
        System.out.println("Ejercicio 1:");
        System.out.println("Hola");
//Ejercicio 2: Escribir un programa que imprima un número entero.
        System.out.println("Ejercicio 2:");
        int a = 273;
        System.out.println("a= "+a);
//Ejercicio 3: Escribir un program que imprima un número decimal.
        System.out.println("Ejercicio 3:");
        double b = 7.5;
        System.out.println("b= "+b);
//Ejercicio 4: Escribir un programa que imprima la suma de 1234 y 532.
        System.out.println("Ejercicio 4:");
        int c;
        c = 1234+532;
        System.out.println("1234+532= "+c);
//Ejercicio 5: Escribir un programa que imprima la resta de 1234 y 532.
        System.out.println("Ejercicio 5:");
        int d;
        d = 1234-532;
        System.out.println("1234-532= "+d);
//Ejercicio 6: Escribir un programa que imprima 1234 x 532.
        System.out.println("Ejercicio 6:");
        int e;
        e = 1234*532;
        System.out.println("1234*532= "+e);
//Ejercicio 7: Escribir un programa que imprima 1234 / 532.
        System.out.println("Ejercicio 7:");
        double f =1234.0;
        f = f/532;
        System.out.println("1234/532= "+f);
//Ejercicio 8: Escribir un programa que imprima los números del 1 al 3.
        System.out.println("Ejercicio 8:");
        int g=1;
        while (g<=3){
            System.out.println("Numeros consecutivos del 1-3: "+g);
            g = g+1;
        }
//Ejercicio 9: Escribir un programa que imprima los números del 1 al 9.
        System.out.println("Ejercicio 9:");
        int h=1;
        while (h<=9){
            System.out.println("Numeros consecutivos del 1-9: "+h);
            h = h+1;
        }
//Ejercicio 10: Escribir un programa que imprima números del 1 al 10000.
        System.out.println("Ejercicio 10:");
        int i=1;
        while (i<=100){ //Pongo 100 para que no sea tan largo
            System.out.print(i+", ");
            i = i+1;
        }
        System.out.println("");
//Ejercicio 11: Escribir un programa que imprima números del 5 al 10.
        System.out.println("Ejercicio 11:");
        int j=5;
        while (j<=10){
            System.out.print(j+", ");
            j = j+1;
        }
        System.out.println("");
//Ejercicio 12: Escribir un programa que imprima números del 5 al 15.
        System.out.println("Ejercicio 12:");
        int k=5;
        while (k<=15){
            System.out.print(k+", ");
            k = k+1;
        }
        System.out.println("");
//Ejercicio 13:Escribir un programa que imprima números del 5 al 15000.
        System.out.println("Ejercicio 13");
        int l=5;
        while (l<=150){ //Pongo 150 para que no sea tan largo
            System.out.print(l+", ");
            l = l+1;
        }
        System.out.println("");
//Ejercicio 14: Imprimir 200 veces la palabra "Hola"
        System.out.println("Ejercicio 14:");
        String m ="Hola";
        int n =1;
        while (n<=20){ //Pongo 20 para que no sea tan largo
            System.out.print(n+": "+m+", ");
            n = n+1;
        }
        System.out.println("");
//Ejercicio 15: Imprimir los primeros 30 cuadrados de los numeros N.
        System.out.println("Ejercicio 15:");
        int ñ=1;
        while (ñ<=30){
            double elevado = Math.pow(ñ, 2);
            System.out.print(ñ+": "+elevado+", ");
            ñ = ñ+1;
        }
        System.out.println("");
//Ejercicio 16: Un programa que multiplique los primeros 20 numeros.
        System.out.println("Ejercicio 16:");
        long o = 1;
        for (int p=1; p<=20; p++){ 
           o *= p;
        }
        System.out.println("Multiplicacion numeros: "+o);
//Ejercicio 17:Imprimir los primeros 100 cuadrados de los numeros N.
        System.out.println("Ejercicio 17:");
        int q=1;
        while (q<=100){
            double elevado = Math.pow(q, 2);
            System.out.print(q+": "+elevado+", ");
            q = q+1;
        }
        System.out.println("");
//Ejercicio 18: Sumar los 100 siguientes numeros desde un dato por teclado.
        System.out.println("Ejercicio 18:");
        System.out.print("Ingresa un numero ");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        for (int p=1; p<=100; p++){ 
           r += p;
        }
        System.out.println("Suma numeros: "+r);
//Ejercicio 19: Convertir euros a dolares.
        System.out.println("Ejercicio 19:");
        System.out.print("Escribe la cantidad de euros ");
        double t = s.nextInt();
        System.out.println("Son "+t*1.05+" dolares");
//Ejercicio 20: Calcular el area de un rectangulo con datos por teclado.
        System.out.println("Ejercicio 20:");
        System.out.println("Ingresa el valor de un lado del rectangulo ");
        int u = s.nextInt();
        System.out.println("Ingresa el valor del otro lado del rectangulo ");
        int v = s.nextInt();
        System.out.println("El area del rectangulo es: "+u*v);
//Ejercicio 21: Lea 2 numeros por teclado y diga cual es menor y mayor.
        System.out.println("Ejercicio 21:");
        System.out.println("Ingresa un valor ");
        int w = s.nextInt();
        System.out.println("Ingresa otro valor ");
        int x = s.nextInt();
        if (w>x){
            System.out.println(w+" es mayor que "+x);
        }else if(x>w){
            System.out.println(x+" es mayor que "+w);
        }else{
            System.out.println(x+" y "+w+" son iguales");
        }
//Ejercicio 22: Lea un numero por teclado e imprima los numeros impares menores.
        System.out.println("Ejercicio 22:");
        System.out.println("Ingresa un valor ");
        int ab = s.nextInt();
        for (int ac = 1; ac <= ab; ac++) {
            if(ac % 2 != 0){
                System.out.println("Los numeros impares anteriores son "+ac);
            }
        }
//Ejercicio 26: Lea tres números enteros positivos y vea cual es mayor y menor.
        System.out.println("Ejercicio 26:");
        System.out.println("Ingresa un valor ");
        int y = s.nextInt();
        System.out.println("Ingresa otro valor ");
        int z = s.nextInt();
        System.out.println("Ingresa otro valor ");
        int aa = s.nextInt();
        if (y==z){
            if (z==aa){
                System.out.println("Todos los valores son iguales");
            }else if(z>aa){
                System.out.println(y+" y "+z+" son los mayores");
            }else {
                System.out.println(y+" y "+aa+" son los mayores");
            }
        }else if(z==aa){
             if(y>z){
                 System.out.println(z+" y "+aa+" son los menores");
             }else{
                 System.out.println(z+" y "+aa+" son los mayores");
             }
        }else if(y>z){
            if(z>aa){
                System.out.println(y+" es el mayor y "+aa+" es el menor");
            }else{
                if(y>aa){
                    System.out.println(y+" es el mayor y "+z+" es el menor");
                }else{
                    System.out.println(aa+" es el mayor y "+z+" es el menor");
                }
            }
        }else if(z>aa){
            if(y>aa){
                System.out.println(z+" es el mayor y "+aa+" es el menor");
            }else{
                System.out.println(z+" es el mayor y "+y+" es el menor");
            }
        }else{
            System.out.println(aa+" es el mayor y "+y+" es el menor");
        }
//Ejercicio 27: Convierta fahrenheit a celsius.
        System.out.println("Ejercicio 27:");
        double Fa = 1;
        while(Fa!=999){
            System.out.println("Escribe un numero en Farenheit ");
            double Far = s.nextInt();
            Fa = Far;
            double Cels = (5*(Far-32))/9; 
            System.out.println(Cels+"°C");
            System.out.println("Escribe 999 para finalizar");
        }
        
    }
    
}
