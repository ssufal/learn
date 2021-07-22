package ssufal.shapes;

abstract class Shape {
    protected int length;

    public Shape(int length) {
        this.length = length;
    }

    abstract void area();
}
