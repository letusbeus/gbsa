package main.store3D.inmemory;

public interface IModelChanger {
    // Inform in case of any changes in the ModelStore
    void notifyChange();
    void registerModelChanger(IModelChangedObserver o);
    void removeModelChanger(IModelChangedObserver o);
}
