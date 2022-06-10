package Tasks.Task4a;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

//    public Shape(){
//        this.color = "unknown";
//        this.isFilled = false;
//    }
//    public Shape(String color, boolean isFilled){
//        this.color = color;
//        this.isFilled = isFilled;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public boolean isFilled() {
//        return isFilled;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setFilled(boolean filled) {
//        isFilled = filled;
//    }

    public String toString(){
        return "Shape with color of" + this.color + " and filled: " + this.isFilled;
    }
}
