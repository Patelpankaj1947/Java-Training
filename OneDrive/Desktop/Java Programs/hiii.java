 class Prson{
   void displayname(){
      System.out.println("pankaj");
   }
 }
 class Students extends Prson{
   void displayclass(){
      System.out.println("jay kher mata");
   }
 }
 class Moniter extends Students{
   void cheeckDiscipline(){
      System.out.println("jay Bajrang bali");
   }
 }
 public class hiii {
 
   public static void main(String[] args) {
      Moniter obj= new Moniter();
      obj.displayname();
      obj.displayclass();
      obj.cheeckDiscipline();
   }
 }