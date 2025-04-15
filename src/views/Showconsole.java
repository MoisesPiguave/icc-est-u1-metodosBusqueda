package views;
import java.util.Scanner;
public class Showconsole {
    Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        System.out.println("Metodo Busqueda");
    }

    public int getCode(){
        System.out.println("INGRESE CODIGO");
        int codigo= scanner.nextInt();
        System.out.println("Codigo ingresado"+ codigo);
        return codigo;
    }

    public void showMessage(String message){
        System.out.println(message);

    }
}
