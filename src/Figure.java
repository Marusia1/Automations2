public class Figure {
    double height;
    double width;
    double length;

    // 2.a  constructor of the class - without parameters (by default, without fields)
    public Figure() {

    }
    // 2. b  constructor of the class - with all parameters
    public Figure(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    // 3. method that returns figure volume length * width * height;

    public double calculateVolume() {
        return this.length * this.width * this.height;
    }
    // 5. Calculation of the figure surface area  S = 2(a · b + a · h + b · h)
     public double calculateSurfaceArea() {
        return 2 * ( this.height * this.length + this.height * this.width + this.width * this.length);
     }
}


