public class Anagrama {

    public static void main(String[] args) {
        String anagrama1 = "conservadora";
    String anagrama2 = "conversadora";
    
    char[] ordenada1 = anagrama1.toCharArray();
    java.util.Arrays.sort(ordenada1);
    String cadena1 = new String(ordenada1);
    
    char[] ordenada2 = anagrama2.toCharArray();
    java.util.Arrays.sort(ordenada2);
    String cadena2 = new String(ordenada2);
    
    if (cadena1.equals(cadena2)) System.out.println("anagramas ok");
        
    }
    
}