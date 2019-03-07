package Zoo;

import Animalia.Animal;
import Excptions.JaulaLotadaException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**

 *
 * @author leona
 */
public class Secao implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private String info;
    private ArrayList<Animal> animais;
    private int maxAnimais;
    private int numAnimais;
    
    public Secao(String info, int maxAnimais) {
        this.info = info;
        animais = new ArrayList<>();
        this.maxAnimais = maxAnimais;
        numAnimais=0;
    }

    public void recebeAnimal(Animal animal)throws JaulaLotadaException{
        if(animais.size() <maxAnimais)
            animais.add(animal);
        else{
            throw new JaulaLotadaException();
        }
        numAnimais = animais.size();
    }
    
    public boolean removeAnimal(String nome){
        Iterator<Animal> animaisIterator = animais.iterator();
            while (animaisIterator.hasNext()) {
               Animal animal = animaisIterator.next();
               if (animal.getName().startsWith(nome)){
                    animaisIterator.remove(); //Única forma de remover enquanto percorre
                    numAnimais = animais.size();
                    return true;
               }
            }
        return false;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public int getMaxAnimais() {
        return maxAnimais;
    }

    public void setMaxAnimais(int maxAnimais) {
        this.maxAnimais = maxAnimais;
    }

    public int getNumAnimais() {
        return numAnimais;
    }    
}