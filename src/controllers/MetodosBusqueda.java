package controllers;
import models.Persona;
import views.Showconsole;
public class MetodosBusqueda {
    private Showconsole Showconsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] person){
    Showconsole = new Showconsole();
    this.people=person;
    showPersonByCode();
    }
    
       
    public int busquedaLineal( int arreglo [], int objetivo){

        for (int i = 0 ; i < arreglo.length ; i++)
            if (arreglo[i] == objetivo){
                return i;
            }
        return -1;
    }


    public int findPersonBycode(int code){
        for (int i =0 ; i< people.length ; i++){
            if ( people[i].getCode() == code);
            return i;
        }
        return -1;
    }
    
    public void showPersonByCode(){
        int codeToFind=Showconsole.getCode();
        int indexPerson=findPersonBycode(codeToFind);
        if (indexPerson>=0){
            Showconsole.showMessage("Persona encontrada");
            Showconsole.showMessage(people[indexPerson].toString());
        }else{
            Showconsole.showMessage("Persona con codigo"+ codeToFind+ " no encontrada");
        }    
        }
    
    }


