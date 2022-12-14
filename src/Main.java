public class Main {
    public static void main(String[] args) {

        Shape s = new Circle(100, 100, 50);
        s.setX(200);
        s.setY(200);
        s.getX();
        s.getY();
        s.draw();

        System.out.println();

        //will not work as Shape has got limited understanding, it does not understand the circle specific things
        //s.setR(60);
        //s.getR();

        if(s instanceof Circle){
            ((Circle) s).setR(60);
            System.out.println(((Circle) s).getR());
            System.out.println();
            s.draw();
        }

        //this type casting will fail, as Shape s is referring to Circle and not to a rect
        /*((Rect)s).setW(400);
        ((Rect)s).setH(400);
        System.out.println(((Rect)s).getW());
        System.out.println(((Rect)s).getH());*/

        s = new Rect(10, 10, 10, 10);


        /*Circle c1 = new Circle(200, 200, 50);
        Circle c1Copy = c1;
        Circle c2 = new Circle(200, 200, 50);

        System.out.println(c1.equals(c1Copy));
        System.out.println(c1.equals(c2));



        Shape s = new Shape(100, 100);
        Circle c = new Circle(200, 200, 50);
        Employee e = new Employee(101,"AA", 1000);
        Manager m = new Manager(202, "BB", 2000, 200);
        String str = "BitCode Java";
        int [] arr = {10, 20, 30, 40, 50};

        System.out.println("************************");
        System.out.println(s.hashCode());
        System.out.println(c.hashCode());
        System.out.println("************************");*/


        /*System.out.println("main");
        System.out.println(c);*/

        /*Object obj;

        obj = s;
        obj = c;
        obj = e;
        obj = m;
        obj = str;
        obj = arr;

        Util.print(s);
        Util.print(c);
        Util.print(e);
        Util.print(m);
        Util.print(str);
        Util.print(arr);

        String str1 = "This is " + c;
        System.out.println(str1);*/

    }
}
