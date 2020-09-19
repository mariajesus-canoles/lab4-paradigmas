//@author Maria Jesus Canoles
//Rut 20300159-2
//Ultimo Edit 06/09/2020
//@version 1.0
package ventanas;

import java.util.Scanner;
import java.util.ArrayList;

/**
* Clase para representar un repositorio,
* determinada por nombreRep, autor, workspace, index, local y remote
* @version 1.8
* @author Maria Jesus Canoles
*/
public class Repositorio {
    //Atributos
    String nombreRep;
    String autor;
    Workspace workspace;
    Index index;
    Local local;
    Remote remote;
    
    //Constructor
    /**
     * @param nombreRep nombre del repositorio
     * @param autor autor del repositorio
     * @param workspace zona workspace
     * @param index zona index
     * @param local zona local
     * @param remote zona remote
     */
    public Repositorio(String nombre, String autor){
        this.gitInit(nombre, autor);
    }
    
    //Metodos
    /**
     * metodo que genera un string con el contenido del repositorio
     * @return contenido del repositorio
     */
    public String toString(){
        String output = "Nombre Rep: " + this.nombreRep + ", Autor: " + this.autor
                + "\nWorkspace: " + this.workspace + "\nIndex: " + this.index + "\nLocal: " 
                + this.local + "\nRemote: " + this.remote;
        return output;
    }
    
    /**
     * metodo que instancia un repositorio a partir de un nombre y autor, con sus zonas vacias
     */
    private void gitInit(String nombre, String autor){
        this.nombreRep = nombre;
        this.autor = autor;
        this.workspace = new Workspace();
        this.index = new Index();
        this.local = new Local();
        this.remote = new Remote();
    }
    
    /**
     * metodo que agrega archivos del workspace al index
     */
    public void gitAdd(String archivosAux){
        String[] archivos = archivosAux.split(" ");
        if(archivos.length == 1 && archivos[0].equals("ALL")){
            for(int i=0; i<this.workspace.archivos.size(); i++){
                this.index.archivos.add(this.workspace.archivos.get(i));
            }
        }
        else{
            for(int j=0; j<archivos.length ; j++){
                int aux = this.workspace.posNombreArchivo(archivos[j]);
                if(aux != -1){
                    this.index.archivos.add(this.workspace.archivos.get(aux));
                }
            }
        }
    }

    /**
     * metodo que genera un commit con los archivos contenidos en el index 
     * y a partir de un mensaje descriptivo
     */
    public void gitCommit(String mensaje){
        Commit commit = new Commit("Master", mensaje, this.index.archivos);
        this.local.commits.add(commit);
        this.index = new Index();
    }
    
    /**
     * metodo que copia en el remote los commits contenidos en el local 
     */
    public void gitPush(){
        for(int i=0; i<this.local.commits.size(); i++){
            if (! this.remote.commits.contains(this.local.commits.get(i))){
            this.remote.commits.add(this.local.commits.get(i));
            }
        }
    }
    
    /**
     * metodo que copia en el workspace los arhivos contenidos en el remote
     */
    public void gitPull(){
        for(int i=0; i<this.remote.commits.size(); i++){
            for(int j=0; j<this.remote.commits.get(i).archivos.size(); j++){
                if(! this.workspace.verificarArchivo(this.remote.commits.get(i).archivos.get(j))){
                    this.workspace.archivos.add(this.remote.commits.get(i).archivos.get(j));
                }
            }
        }
    }
    
    /**
     * metodo que genera un string con el nombre del repositorio, autor, cantidad de archivos en el
     * workspace e index, cantidad de commits en el local, e informa si el remote se encuentra al dia
     * @return informacion sobre el repositorio
     */
    public String gitStatus(){
        String output = "Nombre Repositorio: " + this.nombreRep + "\nAutor Repositorio: " + this.autor 
                + "\nCantidad archivos en el Workspace: " + this.workspace.archivos.size() 
                + "\nCantidad archivos en el Index: " + this.index.archivos.size()
                + "\nCantidad commits en el Local: " + this.local.commits.size();
                if(this.local.commits.equals(this.remote.commits)){
                    output = output + "\nRemote se encuentra al dia";
                }
                else{
                    output = output + "\nRemote NO se encuentra al dia";
                }
        return output;
    }
   
    /** 
     * metodo que genera un string con los cinco ultimos commits agregados al local, en caso de existir menos
     * commits, genera el string con los commits respectivos
     * @return 
     */
    public String gitLog(){
        int largo = this.local.commits.size();
        String output;
        if(largo<=5){
            output = "Los ultimos " + largo + " commits agregados al Local son:\n";
            for(int i=largo; i>0; i--){
                output = output + this.local.commits.get(i-1) + "\n";
            }
        }
        else{
            output = "Los ultimos 5 commits agregados al Local son:\n";
            for(int j=5; j>0; j--){
                output = output + this.local.commits.get(j-1) + "\n";
            }
        }
        return output; 
    }
   
    /**
     * metodo que crea un commit con el nombre de una nueva rama ingresada por el usuario
     * con los archivos contenidos en el index
     */
    public void gitBranch(String rama, String mensaje){
        Commit commit = new Commit(rama, mensaje, this.index.archivos);
        this.local.commits.add(commit);
        this.index = new Index();
    }
    
}
