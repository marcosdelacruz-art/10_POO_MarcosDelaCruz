package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Contacto;
import java.util.ArrayList;

public class AgendaController {

    //Lista Contactos ( Almacenar )
    private ArrayList <Contacto> contactos;

    //Constructor
    public AgendaController(){
        contactos = new ArrayList<>();
    }

    //Agregar Contacto
    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
        System.out.println("Conctacto Agregado correctamente");
    }

    //Listar Contactos
    public void listarContactos(){
        System.out.println("LISTA DE CONTACTOS");
        for ( Contacto contacto : contactos){
            contacto.mostrarContacto();
        }
    }

    // AÑADIDO - RETO 1: Buscar Contacto
    public void buscarContacto(int id) {
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto.getId() == id) {
                System.out.println("--- CONTACTO ENCONTRADO ---");
                contacto.mostrarContacto();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con el ID: " + id);
        }
    }

    // AÑADIDO - RETO 2: Eliminar Contacto
    public void eliminarContacto(int id) {
        boolean eliminado = contactos.removeIf(contacto -> contacto.getId() == id);
        if (eliminado) {
            System.out.println("Contacto con ID " + id + " eliminado correctamente.");
        } else {
            System.out.println("No se encontró el contacto con ID " + id + " para eliminar.");
        }
    }
}