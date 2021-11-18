public class Prueba2 {
    public static void main(String[] args) {
        int figura;
        for (int i = 0; i <40; i++) {
           figura = (int)(Math.random() * 4);
        switch (figura) {
            case 0: 
            System.out.printf("🗿");
            break;
            case 1:
            System.out.printf("--");
            break;
            case 2:
            System.out.printf("🖖");
            break;
            case 3:
            System.out.printf("🥵");
        }
        }
    }
}
