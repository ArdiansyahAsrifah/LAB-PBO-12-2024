abstract class Anjing {
    protected int position;
    protected int averageLength;

    public Anjing(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void move();

    public abstract void describe();
}