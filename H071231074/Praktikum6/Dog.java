package Praktikum6;

abstract class Dog {
    protected int position, averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    abstract void move();
    abstract void describe();
}
