package main.store3D.inmemory;

import main.store3D.models.Camera;
import main.store3D.models.Flash;
import main.store3D.models.PoligonalModel;
import main.store3D.models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    private List<IModelChangedObserver> observers = new ArrayList<>();

    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PoligonalModel m){
        models.add(m);
        notifyChange();
    }

    public void add(Flash f){
        flashes.add(f);
        notifyChange();
    }

    public void add(Scene s){
        scenes.add(s);
        notifyChange();
    }

    public void add(Camera c){
        cameras.add(c);
        notifyChange();
    }

    @Override
    public void notifyChange() {
        for (IModelChangedObserver observer : observers){
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(IModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void removeModelChanger(IModelChangedObserver o) {
        observers.remove(o);
    }

//    @Override
//    public String toString() {
//        return "ModelStore:\n" +
//                "\tobservers=" + observers +
//                ",\n\tmodels=" + models +
//                ",\n\tflashes=" + flashes +
//                ",\n\tscenes=" + scenes +
//                ",\n\tcameras=" + cameras;
//    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ModelStore:\n");

        if (!observers.isEmpty()) {
            result.append("observers: ");
            for (IModelChangedObserver observer : observers) {
                result.append(observer).append(", ");
            }
            result.setLength(result.length() - 2); // Удаляем последнюю запятую и пробел
            result.append("\n");
        } else {
            result.append("observers: not specified\n");
        }

        if (!models.isEmpty()) {
            result.append("models: ");
            for (PoligonalModel model : models) {
                result.append(model).append(", ");
            }
            result.setLength(result.length() - 2); // Удаляем последнюю запятую и пробел
            result.append("\n");
        } else {
            result.append("models: not specified\n");
        }

        if (!flashes.isEmpty()) {
            result.append("flashes: ");
            for (Flash flash : flashes) {
                result.append(flash).append(", ");
            }
            result.setLength(result.length() - 2);
            result.append("\n");
        } else {
            result.append("flashes: not specified\n");
        }

        if (!scenes.isEmpty()) {
            result.append("scenes: ");
            for (Scene scene : scenes) {
                result.append(scene).append(", ");
            }
            result.setLength(result.length() - 2);
            result.append("\n");
        } else {
            result.append("scenes: not specified\n");
        }

        if (!cameras.isEmpty()) {
            result.append("cameras: ");
            for (Camera camera : cameras) {
                result.append(camera).append(", ");
            }
            result.setLength(result.length() - 2);
            result.append("\n");
        } else {
            result.append("cameras: not specified\n");
        }

        return result.toString();
    }
}
