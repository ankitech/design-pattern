package bridge.shape;

import bridge.renderer.Renderer;

public class Square extends Shape {
    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
