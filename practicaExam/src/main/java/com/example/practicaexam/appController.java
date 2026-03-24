package com.example.practicaexam;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class appController {

    Validar validar = new Validar();
    public int id=0;

    @FXML
    private ComboBox<String> parentestos;

    @FXML
    private TextField nombre;

    @FXML
    private TextField telefono;

    @FXML
    private Label Mensaje;

    @FXML
    private TextField buscarCon;


    @FXML
    private ListView<Contact> listaContactos;

    private ObservableList<Contact> contactos = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        String[] parentescos = {
                "Padre", "Madre", "Hermano", "Hermana",
                "Abuelo", "Abuela", "Tío", "Tía"
        };

        parentestos.getItems().addAll(parentescos);

        listaContactos.setItems(contactos);

    }

    @FXML
    public void actualizar(){
        String buscarC = buscarCon.getText();
        String Nombre = nombre.getText();
        String Telefono = telefono.getText();
        String Parentesco = parentestos.getValue();

        Boolean v = validar.Validar(Nombre,Telefono,Parentesco);
        if (v == true){
            for (Contact c: contactos){
                if (buscarC.equals(c.getNombre())){
                    int IDE = c.getId();
                    Contact NuevoContaco = new Contact(Nombre,Telefono,Parentesco,IDE);
                    contactos.set(IDE,NuevoContaco);
                    buscarCon.clear();
                    nombre.clear();
                    telefono.clear();
                    parentestos.setValue(null);
                }
            }
        } else {
            Mensaje.setText("Error en los datos");
        }

    }
    public void agregar(){
        boolean valido = false;
        String Nombre = nombre.getText();
        String Telefono = telefono.getText();
        String Parentesco = parentestos.getValue();
        for (Contact c: contactos){
            if (Nombre.equals(c.getNombre())) {
                Mensaje.setText("Nombre repetidos");
                return;
            }
        }
        Boolean v = validar.Validar(Nombre,Telefono,Parentesco);
        if (v == true){
            Contact NuevoContaco = new Contact(Nombre,Telefono,Parentesco,id);
            contactos.add(NuevoContaco);
            nombre.clear();
            telefono.clear();
            parentestos.setValue(null);
            Mensaje.setText("");
            valido = true;
            id++;
        }
        if (!valido){
            Mensaje.setText("Error en los datos");
            Mensaje.setStyle("-fx-text-fill: red");
        }


    }
    public void eliminar(){
        String Nombre = nombre.getText();
        for (Contact c: contactos){
            if (Nombre.equals(c.getNombre())){
                contactos.remove(c);
                nombre.clear();
                telefono.clear();
                parentestos.setValue(null);
                buscarCon.clear();
                break;
            }
        }
    }
    public void buscar(){
        boolean encontrado =  false;
        String Nombre = buscarCon.getText();
        for (Contact c: contactos){
            if (Nombre.equals(c.getNombre())){
                buscarCon.setText(c.getNombre());
                nombre.setText(c.getNombre());
                telefono.setText(c.getTelefeno());
                parentestos.setValue(c.getParentesco());
                Mensaje.setText("");
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            Mensaje.setText("Numero no encontrado :(");
            Mensaje.setStyle("-fx-text-fill: red");
        }
    }
    public void limpiar(){
        buscarCon.clear();
        nombre.clear();
        telefono.clear();
        parentestos.setValue(null);
    }

}
