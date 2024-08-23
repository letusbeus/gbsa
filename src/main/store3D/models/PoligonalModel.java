package main.store3D.models;

import java.util.List;

public class PoligonalModel {

    private List<Poligon> poligons;
    private List<Texture> textures;

    // Конструктор для модели без текстур
    public PoligonalModel(List<Poligon> poligons) {
        this.poligons = poligons;
    }

    // Конструктор для модели с текстурами
    public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

    public List<Poligon> getPoligons() {
        return poligons;
    }

    public List<Texture> getTextures() {
        return textures;
    }

//    @Override
//    public String toString() {
//        return "PoligonalModel{" +
//                "poligons=" + poligons +
//                ", textures=" + textures +
//                '}';
//    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("PoligonalModel{");

        if (poligons != null && !poligons.isEmpty()) {
            result.append("poligons=").append(poligons);
        } else {
            result.append("Poligons aren't specified");
        }

        if (textures != null && !textures.isEmpty()) {
            if (result.length() > "PoligonalModel{".length()) {
                result.append(", ");
            }
            result.append("textures=").append(textures);
        } else {
            if (result.length() > "PoligonalModel{".length()) {
                result.append(", ");
            }
            result.append("textures: not specified");
        }

        result.append('}');
        return result.toString();
    }

}
