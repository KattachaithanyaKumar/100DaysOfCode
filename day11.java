/*
    Day 11:
    Inheritance
*/
class shape {
    int sides = 0;
    void howManySides()  {}
}

class rectangle extends shape {
    int sides = 4;
    void howManySides()  {
        System.out.println("Sides: " + sides);
    }
}

class square extends shape {
    int sides = 4;
    void howManySides()  {
        System.out.println("Sides: " + sides);
    }
}

class triangle extends shape {
    int sides = 3;
    void howManySides()  {
        System.out.println("Sides: " + sides);
    }
}

class pentagon extends shape {
    int sides = 5;
    void howManySides()  {
        System.out.println("Sides: " + sides);
    }
}

class hexagon extends shape {
    int sides = 6;
    void howManySides()  {
        System.out.println("Sides: " + sides);
    }
}

class octagon extends shape {
    int sides = 8;
    void howManySides()  {
        System.out.println("Sides: " + sides);
    }
}

public class day11 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        square s = new square();
        triangle t = new triangle();
        pentagon p = new pentagon();
        hexagon h = new hexagon();
        octagon o = new octagon();

        r.howManySides();
        s.howManySides();
        t.howManySides();
        p.howManySides();
        h.howManySides();
        o.howManySides();
    }    
}
