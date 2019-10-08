package bridge.shape;

import bridge.renderer.Renderer;

public class Triangle extends Shape {

    public Triangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
