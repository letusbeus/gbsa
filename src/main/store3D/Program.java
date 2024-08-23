package main.store3D;

import main.store3D.inmemory.ModelStore;
import main.store3D.inmemory.Observer1;
import main.store3D.inmemory.Observer2;
import main.store3D.models.Poligon;
import main.store3D.models.PoligonalModel;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        ModelStore store = new ModelStore();
        store.registerModelChanger(observer1);
        store.registerModelChanger(observer2);

        Poligon p1 = new Poligon();
        List<Poligon> poligons = new ArrayList<>();
        poligons.add(p1);
        PoligonalModel poligonModel = new PoligonalModel(poligons);
        store.add(poligonModel);
        System.out.println(store);
    }
}