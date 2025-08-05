
public class CLASS_OBJ {
    public static void main(String[] args) {
        // Student student = new Student(); // new keyword used to create space in the memory for the object...
        // student.name = "John"; // use . operator to access the instance variable of the class..
        // System.out.println("Student Name is " + student.name);
        // // student.age = 20; //accessing the instance variable of the class...
        // student.age = 20;
        // student.setAge(25);
        // System.out.println("Student Age is" + student.age);

        Pen pen = new Pen();
        pen.setColor("Blue");
        System.out.println(pen.getColor());


        //set Pirce and get Price

        pen.setPrice(50);
        pen.getPrice();
    }
}

class Student {
    String name; // blue print of a class
    // int age; //instance variable of a class
    int age;

    public void setAge(int ummar) { // method of a class
        age = ummar;
    }

}

class Pen {
    private String color;
    private int price;

    public void setColor(String color){
        this.color = color; // 'this' keyword is used to refer to the current object..
    }

    // getter method to access the private variable
    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price; // 'this' keyword is used to refer to the current object..
    }

    public int getPrice(){
        return price;
    }
}
