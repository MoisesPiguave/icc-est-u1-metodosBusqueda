import controllers.MetodosBusqueda;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] persones = new Persona[7];
        persones[0]= new Persona(101,"Juan");
        persones[1]= new Persona(102,"Maria");
        persones[2]= new Persona(103,"Carlos");
        persones[3]= new Persona(104,"Ana");
        persones[4]= new Persona(105,"Luis");
        persones[5]= new Persona(106,"Sofia");
        persones[6]= new Persona(107,"Pedro");
        MetodosBusqueda mb = new MetodosBusqueda(persones);
    }
}
