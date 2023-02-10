public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Hugo Boss");


        Triangle triangleA = new Triangle(15,8,15,8,15);
        Triangle triangleB = new Triangle(12,88,185,8.65,15.55);

        double triaAArea = triangleA.findArea();
        System.out.println(triaAArea);

        double triaBArea = triangleB.findArea();
        System.out.println(triaBArea);

        System.out.println(triangleA.sideLenOne);
        System.out.println(triangleB.base);

        //access static var
        System.out.println(Triangle.numOfSides);


    }


}