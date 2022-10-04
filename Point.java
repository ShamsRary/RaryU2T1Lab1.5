public class Point {
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
//        int xValue = x;
//        int yValue = y;

        //return x + "" + y;
    }

    public Point(int num)
    {
        x = num;
        y = num;
    }

    public Point()
    {
        y = 0;
        x = 0;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int newX)
    {
        x = newX;
    }

    public void setY(int newY)
    {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + "," + y + ")";
    }

    public String quadrant()
    {
        if (x > 0 && y > 0)
        {
            return "quadrient 1";
        }

        else if (x < 0 && y > 0)
        {
            return "quadreient 2";
        }

        else if (x < 0 && y < 0)
        {
            return "quadrient 3";
        }

        else if (x > 0 && y < 0)
        {
            return "quadreient 4";
        }

        else if (x == 0 && y == 0) {
            return "origin";
        }
    return "On axis";
    }

}
