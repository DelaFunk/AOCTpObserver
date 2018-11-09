package Interfaces;

import Interfaces.ObserverGenerator;
import Interfaces.Subject;

public abstract class Displayer implements ObserverGenerator {
    @Override
    public abstract void update(Subject Generator);
}
