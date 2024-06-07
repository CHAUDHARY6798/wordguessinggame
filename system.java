class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");

    }

public void printcolor(){
    System.out.println(this.color);
}
}
public class system{
    public static void main(String[]args){
        Pen Pen1=new Pen();
        Pen1.color="blue";
        Pen1.type="gel";
        Pen1.write();
        Pen Pen2=new Pen();
        Pen2.color="black";
        Pen2.type="ballpoint";
        Pen1.printcolor();
        Pen2.printcolor();

    }

}