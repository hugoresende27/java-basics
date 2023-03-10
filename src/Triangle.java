public class Triangle {


    //STATIC var
    static int numOfSides = 3;

    //attribue or instance variables NO STATIC
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    //constructor
    public Triangle(double base,
                    double height,
                    double sideLenOne,
                    double sideLenTwo,
                    double sideLenThree){
        this.height = height;
        this.base = base;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea()
    {
        return (this.base * this.height) / 2;
    }
}
