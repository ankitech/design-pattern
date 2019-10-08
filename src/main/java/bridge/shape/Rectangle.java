package bridge.shape;

import bridge.renderer.Renderer;

public class Rectangle extends Shape {
    public Rectangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
