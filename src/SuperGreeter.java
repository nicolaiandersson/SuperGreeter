import java.util.Scanner;
public class SuperGreeter {

    public void start() {
        System.out.println("Det virker!");
    }
    public void greet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Indtast dit navn:");
        String navn = scan.next();
        System.out.println("Hej " + navn);
    }
    public void askAboutAge() {
        System.out.println("Indtast din alder:");
        Scanner scan = new Scanner(System.in);
        int alder = scan.nextInt();
        System.out.println(alder);
    }
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
        sg.askAboutAge();
    }

}