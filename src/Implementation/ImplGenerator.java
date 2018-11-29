package Implementation;

import Interfaces.AlgoDiffusion;
import Interfaces.Observer;
import Interfaces.Generator;

import java.util.ArrayList;

public abstract class ImplGenerator implements Generator {

    private int value;
    private AlgoDiffusion algo;
    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    public void attach(Observer o){
        this.observerList.add(o);
    }
    public void detach(Observer o){
        this.observerList.remove(o);
    }

    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }

    public void tick(){
        for(int i = 0; i < observerList.size(); i++){
            Observer o = observerList.get(i);
            o.update(this);
        }
    }

}
