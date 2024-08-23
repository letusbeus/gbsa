package main.store3D.inmemory;

public class Observer2 implements IModelChangedObserver{

    @Override
    public void applyUpdateModel() {
        System.out.println("New polimodel has been added - observer#2");
    }

    @Override
    public String toString() {
        return "Observer2";
    }
}
