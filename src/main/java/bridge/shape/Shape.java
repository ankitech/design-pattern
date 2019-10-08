package bridge.shape;

import bridge.renderer.Renderer;

public abstract class Shape {

    Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return String.format("Drawing %s as %s",getName(),renderer.whatToRenderAs());
    }
}
