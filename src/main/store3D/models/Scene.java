package main.store3D.models;

import java.util.List;

public class Scene {
    private int id;
    private List<PoligonalModel> models;
    private List<Flash> flashes;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public Object method1(Object type) {
        // Реализация method1
        return null;
    }

    public Object method2(Object type1, Object type2) {
        // Реализация method2
        return null;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "id=" + id +
                ", models=" + models +
                ", flashes=" + flashes +
                '}';
    }

    // Геттеры и сеттеры

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(List<PoligonalModel> models) {
        this.models = models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
    }
}

