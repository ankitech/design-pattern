package bridge.shape;

import bridge.renderer.Renderer;

public class Circle extends Shape {
    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
