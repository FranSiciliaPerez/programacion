
class MediaArgumentos {

  public static void main(String[] args) {
    double suma = 0;

    for (int i = 0; i < args.length; i++) {
      suma += Double.parseDouble(args[i]);
    }

    System.out.println(suma / args.length);

  }
}
