package Implementation;

import Interfaces.ObserverGenerator;
import Interfaces.Subject;

public abstract class Displayer implements ObserverGenerator {
    @Override
    public void update(Subject generator){
        if ( generator instanceof ImplGenerator){
            ImplGenerator g = (ImplGenerator) generator;
            System.out.print(g.getValue());
        }
    }
}
