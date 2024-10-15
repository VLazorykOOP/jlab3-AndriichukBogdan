public class Task2 {
    abstract static class Figure {
        public abstract float getSquare() ;
        public abstract float getPerimeter();
    }
    static class Rectangle extends Figure {
        float x, y;
        public Rectangle(float x, float y) {
            this.x = x;
            this.y = y;
        }
        public float getSquare() {
            return this.x*this.y;
        }
        public float getPerimeter() {
            return (2*this.x)+(2*this.y);
        }
    }
    static class Triangle extends Figure {
        float x, y, z;
        public Triangle(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public float getPerimeter() {
            return this.x+this.y+this.z;
        }

        public float getSquare() {
            float p = (this.getPerimeter())/2;
            return (float) Math.sqrt(p*(p-this.x)*(p-this.y)*(p-this.z));
        }
    }

    static class Circle extends Figure {
        float radius;
        public Circle(float radius) {
            this.radius = radius;
        }
        public float getSquare() {
            return (float) (3.14*this.radius*this.radius);
        }
        public float getPerimeter() {
            return (float) (3.14*this.radius);
        }
    }
    static class Trapezium extends Figure {
        float upSide, bottomSide,rightSide,leftSide, h;
        public Trapezium(float upSide, float bottomSide, float rightSide, float leftSide, float h) {
            this.upSide = upSide;
            this.bottomSide = bottomSide;
            this.rightSide = rightSide;
            this.leftSide = leftSide;
            this.h = h;
        }
        public float getSquare() {
            return (float) (0.5*(this.upSide+this.bottomSide)*this.h);
        }

        public float getPerimeter() {
            return (float) (this.upSide+this.bottomSide+this.rightSide+this.leftSide);
        }

    }
    public static void main(String[] args) {
    Rectangle square = new Rectangle(2,2);
    System.out.printf("Square of rectangle : %f \n",square.getSquare());
    System.out.printf("Perimeter of rectangle : %f \n",square.getPerimeter());
    Triangle triangle = new Triangle(2,2,3);
    System.out.printf("Square of triangle : %f \n",triangle.getSquare());
    System.out.printf("Perimeter of triangle : %f \n",triangle.getPerimeter());
    Circle circle = new Circle(5);
    System.out.printf("Square of Circle : %f \n",circle.getSquare());
    System.out.printf("Perimeter of Circle : %f \n",circle.getPerimeter());
    Trapezium trapezium = new Trapezium( 5,6,7,7,1);
    System.out.printf("Square of Trapezium : %f \n",trapezium.getSquare());
    System.out.printf("Perimeter of trapezium : %f \n",trapezium.getPerimeter());
    System.out.println("End!");
    }
}
