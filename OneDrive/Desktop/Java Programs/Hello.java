 class student{
    int age;
    student(int age){
      this.  age = age;
    }
    void print(){
        System.out.println(age);
    }
 }
 public class Hello {
 
    public static void main(String[] args) {
        student obj= new student(23);
        obj.print();
    }
 }