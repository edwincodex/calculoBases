
package com.mycompany.calculobases;

public class Calculadora {
    public String DeBaseXABaseY(String numeroBaseX,int baseX,int baseY){
   
        return null;
   
}
    //comprobacion de Bases 2--8-10-16
    public static boolean BaseDecimal(int decimal) {
        
        return true;
    }
    
    public static boolean BaseBinario(int binario) {
       
        String binarioCadena = String.valueOf(binario);
        for (int i = 0; i < binarioCadena.length(); i++) {
            char caracter = binarioCadena.charAt(i);
            if (caracter != '0' && caracter != '1') {
                return false;
            }
        }
        return true;
    }
    public static boolean BaseOctal(int octal) {
        
        String octalCadena = String.valueOf(octal);
        String caracteresOctales = "01234567";
        for (int i = 0; i < octalCadena.length(); i++) {
            char caracter = octalCadena.charAt(i);
           
            if (caracteresOctales.indexOf(caracter) == -1) {
                return false;
            }
        }
        return true;
    }
    public static boolean BaseHexadecimal(String hexadecimal) {
       
        String caracteresHexadecimales = "0123456789ABCDEF";
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
           
            if (caracteresHexadecimales.indexOf(caracter) == -1) {
                return false;
            }
        }
        return true;
    }
    //------------------
    //Calculo segun test Base 10 a 2-8-16
    //------------------
    public static String decimalXbinario(int decimal) {
        String binario = "";
        while (decimal > 0) {
            binario = decimal % 2 + binario;
            decimal = decimal / 2;
        }
        return binario;
    }
    public static String decimalXoctal(int decimal) {
        
        String octal = "";
        int residuo;
        char[] caracteresOctales = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while (decimal > 0) {
            residuo = decimal % 8;
            char caracter = caracteresOctales[residuo];
            octal = caracter + octal;
            decimal = decimal / 8;
        }
        return octal;
    }
    public static String decimalXHexadecimal(int decimal) {
        
        String hexadecimal = "";
        int residuo;
        char[] caracteresHexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            residuo = decimal % 16;
            char caracterHexadecimal = caracteresHexadecimales[residuo];
            hexadecimal = caracterHexadecimal + hexadecimal;
            decimal = decimal / 16;
        }
        return hexadecimal;
    }

    //------------------
    //Calculo segun test Base 2 a 8-10-16
    //------------------
     public static int binarioXdecimal(int binario) {
        int decimal = 0;
        int potencia = 0;
        while (true) {
            if (binario == 0) {
                break;
            } else {
                int temp = binario % 10;
                decimal += temp * Math.pow(2, potencia);
                binario = binario / 10;
                potencia++;
            }
        }
        return decimal;
    }
    /*public static int binarioXoctal(int binario) {
        int noctal = 0;
        int decimal = 0;
        int potencia = 0;
        while (true) {
            if (binario == 0) {
                break;
            } else {
                int temp = binario % 10;
                decimal += temp * Math.pow(2, potencia);
                binario = binario / 10;
                potencia++;
            }
        }
        return decimal;
    }*/
    
    //------------------
    //Calculo segun test Base 8 a 2-10-16
    //------------------
    public static int octalXdecimal(int octal) {
        int decimal = 0;
        int potencia = 0;
         while (true) {
            if (octal == 0) {
                break;
            } else {
                int temp = octal % 10;
                decimal += temp * Math.pow(8, potencia);
                octal = octal / 10;
                potencia++;
            }
        }
        return decimal;
    }

        
    //------------------
    //Calculo segun test Base 16 a 2-8-10
    //------------------
    
    
    
    public static int hexadecimalXdecimal(String hexadecimal) {
        String caracteresHexadecimales = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        int decimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
            int posicionEnCaracteres = caracteresHexadecimales.indexOf(caracter);
            decimal = 16 * decimal + posicionEnCaracteres;
        }
        return decimal;
    }
}
