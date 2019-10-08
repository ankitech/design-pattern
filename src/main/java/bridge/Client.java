package bridge;

import bridge.renderer.RasterRenderer;
import bridge.renderer.Renderer;
import bridge.renderer.VectorRenderer;
import bridge.shape.Shape;
import bridge.shape.Square;
import bridge.shape.Triangle;

public class Client {

    public static void main(String[] args) {

        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape vectorTriangle = new Triangle(vector);
        Shape rasterSquare = new Square(raster);

        System.out.println(vectorTriangle);
        System.out.println(rasterSquare);
    }
}
