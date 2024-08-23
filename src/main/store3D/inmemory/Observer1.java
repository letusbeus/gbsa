package main.store3D.inmemory;

public class Observer1 implements IModelChangedObserver{

    @Override
    public void applyUpdateModel() {
        System.out.println("New polimodel has been added - observer#1");
    }

    @Override
    public String toString() {
        return "Observer1";
    }
}
