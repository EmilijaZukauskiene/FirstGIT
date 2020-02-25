package lt.sdacademy.advanced_features.abstract_examples.shape;

public abstract class Shape {
    private String shapeDescription;

    public Shape (String shapeDescription){
        this.shapeDescription = shapeDescription;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }
}

