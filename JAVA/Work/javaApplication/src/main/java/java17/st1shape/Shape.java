package java17.st1shape;

public abstract  class Shape {
    protected String color="";
    protected int x=0;
    protected int y=0;
   
    
    public  void draw(){
        System.out.println("Shape draw()");
    }
    
    public abstract Shape getShape();

    
    
    @Override
    public String toString() {
        return "Shape [color=" + color + ", x=" + x + ", y=" + y + "]";
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
