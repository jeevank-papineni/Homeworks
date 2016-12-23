public class ShapeDemo {
	public static void main(String args[]){
Shape shape=null;
shape=new Square();
shape.draw();
shape=new Rectangle();
shape.draw();
shape.drawSquare();
shape.drawRectangle();
}
}
