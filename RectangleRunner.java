public class RectangleRunner {
    public static void main(String[] args)
    {

//        Rectangle plot1 = new Rectangle(150,200);
//
//        System.out.println("plot1 length " + plot1.getLength());
//        System.out.println("plot1 width " + plot1.getWidth());
//        System.out.println("plot1 area " + plot1.calculateArea());
//        Rectangle plot2 = new Rectangle(125);
//
//        System.out.println("plot2 length " + plot2.getLength());
//        System.out.println("plot2 width " + plot2.getWidth());
//        System.out.println("plot2 area " + plot2.calculateArea());
//        Rectangle plot3 = new Rectangle();
//
//        System.out.println("plot3 length " + plot3.getLength());
//        System.out.println("plot3 width " + plot3.getWidth());
//        System.out.println("plot1=3 area " + plot3.calculateArea());

        Rectangle plot1 = new Rectangle(150,200);
        plot1.setWidth(75);
        System.out.println("plot1 length " + plot1.getLength());
        System.out.println("plot1 width " + plot1.getWidth());
        System.out.println("plot1 area " + plot1.calculateArea());
        Rectangle plot2 = new Rectangle(125);
        plot2.setWidth(75);
        plot2.setLength(75);
        System.out.println("plot2 length " + plot2.getLength());
        System.out.println("plot2 width " + plot2.getWidth());
        System.out.println("plot2 area " + plot2.calculateArea());
        Rectangle plot3 = new Rectangle();
        plot3.setWidth(75);
        System.out.println("plot3 length " + plot3.getLength());
        System.out.println("plot3 width " + plot3.getWidth());
        System.out.println("plot1=3 area " + plot3.calculateArea());

        System.out.println("These 3 plots require " + (plot1.calculateArea() + plot2.calculateArea() + plot3.calculateArea()) + " square feet of seeds.");





    }
}
