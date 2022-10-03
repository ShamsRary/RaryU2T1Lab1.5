public class Point {
    private int x;
    private int y;

    public Point(int x, int y)
    {
        double xValue = x;
        double yValue = y;
    }

    public Point(int x)
    {
        y = x;
    }

    public Point()
    {
        y = 0;
        x = 0;
    }

    public int getx()
    {
        return x;
    }

    public int gety()
    {
        return y;
    }

    public void setx(int newX)
    {
        x = newX;
    }

    public void sety(int newY)
    {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + "," + y + ")";
    }

    public String quadrant()
    {

    }

}
