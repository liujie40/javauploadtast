package java14.st4shape;

public class Rectangle extends Shape {
    
    private int width =0;
    private int height =0;
    
    
    
    
    
    //생성자
    public Rectangle(String color, int width, int height) {
        super(color);
        System.out.println("Rectangle(String color, int width, int height)");
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color) {
        super(color);
        System.out.println("Rectangle(String color)");
        // TODO Auto-generated constructor stub
    }
    public Rectangle(int x, int y, String color) {
        super(x, y, color);
        System.out.println("Rectangle(int x, int y, String color)");
        // TODO Auto-generated constructor stub
    }
    public Rectangle() {
        super();
        System.out.println("Rectangle()");
    }
    public Rectangle(int width, int height) {
        super();
        System.out.println("Rectangle(int width, int height)");
        this.width = width;
        this.height = height;
    }
    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        System.out.println("Rectangle(int x, int y, String color, int width, int height)");
        this.width = width;
        this.height = height;
    }
    
    //to.string
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height
                + ", Shape=" + super.toString() + "]";
    }
    
    //get&set
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    
}
