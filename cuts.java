class Student{
    String name;
    int  age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);


    }
    // Student(){//non parrameterized constructor
    //    System.out.println("constructor called"); 
    // }
//  Student(String name,int age){//parameter name//parameterized consttructor//
//     this.name=name;//objec  name//
//     this.age=age;


//  }
Student(Student s2){//copy constructor//
    
    this.name=s2.name;
    this.age=s2.age;

}

Student(){

}
}

public class cuts {
     public static void main(String[]args){
       Student s1=new Student();
       
       s1.age=21;
       
       s1.name="Happy";//
       Student s2=new Student(s1);
       s2.printinfo();
     }
}
