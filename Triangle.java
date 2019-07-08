public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String triangle_type(){
        if(a==b&&b==c){
            return "equilateral triangle";
        }

        if(a==b||b==c||c==a){
            return "isosceles triangle";
        }

        return "ordinary triangle";
    }
}
