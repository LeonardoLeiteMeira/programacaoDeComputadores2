package Arquivos;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Artur
 */
public class Arquivos{
    
    public Arquivos(){
        
    }
    
    public void EscreveObjeto(Object object, String nome_arquivo){
        try {
        FileOutputStream fos = new FileOutputStream(nome_arquivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        // escreve objeto
        oos.writeObject(object);
        
        // fecha recursos
        oos.close();
        fos.close();
        
        } catch (IOException e){
            e.printStackTrace();
        };
    }
    
    public Object LeObjeto(String nome_arquivo){
        Object object = new Object();
        try {
            FileInputStream is = new FileInputStream(nome_arquivo);
            ObjectInputStream ois = new ObjectInputStream(is);
            object = ois.readObject();
            ois.close();
            is.close();
            return object;
            
        }  catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
       
        object = null;
        return object;
    }
}
