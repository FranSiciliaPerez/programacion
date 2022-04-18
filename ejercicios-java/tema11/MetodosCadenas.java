public class MetodosCadenas {
    public static void main(String[] args) {
        String frase = "hola, mundo cruel hbhwbdchbd cruel bdhdbdhcbd cruel cnhdchbdcdjncjdn";
        
        System.out.println("Resultado del chartAt(): '" + frase.charAt(2) + "'");

        System.out.println(frase.indexOf("cruel"));
        
        System.out.println(miIndexOf(frase, "cruel", 20, 50));

    }
    public static int miIndexOf(String frase, String palabra, int menor, int mayor){
            
        if ((frase.indexOf(palabra, menor) <= mayor) && (frase.indexOf((palabra, menor) <= mayor) != -1)){
            return frase.indexOf(palabra);
        } else {
            return -1;
        }
    }
}
