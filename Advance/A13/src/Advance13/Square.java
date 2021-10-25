package Advance13;

class Square implements Runnable
{
    int x;

    public Square(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("Square is "+x*x);
    }
}
