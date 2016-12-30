/**
 * The HelloWorld class implements an application that
 * simply prints a variation of "Hello World!" to standard output.
 */
class HelloWorld {
    public static void main(String[] args) {
      String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        System.out.println("Hello Pern!" + timeStamp); // Display the string with a timestamp.
    }
}
