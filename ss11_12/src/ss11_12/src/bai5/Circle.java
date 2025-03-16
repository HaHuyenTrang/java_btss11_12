package bai5;

public class Circle implements Colorable{
    private int R; // bán kính hình tròn
    private String color;

    public Circle(String color, int R){
        this.R = R;
        this.color = color;
    }

    public int getR() {
        return R;
    }
    public void setR(int R) {
        this.R = R;
    }
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void displayInfo(){
        System.out.println("R: " +R +" Color: " +color);
    }

}
