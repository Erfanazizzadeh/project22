 interface  NameAble {
    void getName();
 }
 interface CanThink{
    void think();
 }
 interface CantTalk extends CanThink{
    void talk();
 }
 abstract class NamedObject{
    private String name;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
 class Student extends NamedObject{
 }
  class Person implements NameAble,CantTalk,CanThink{

      @Override
      public void getName() {

      }

      @Override
      public void think() {
          System.out.println("thinking ");
      }

      @Override
      public void talk() {
          System.out.println("Talking");
      }
  }


abstract public class project022 {
      public static void main(String[] args) {
          CantTalk c = new Person();
          c.talk();
          NameAble n = new Person();


          NamedObject no = new Student();
          System.out.println(no.getName());


      }

   }



