public class Chick{
String name = "fluffy";
{System.out.println("Initialized fluffy here");}
public Chick(){
System.out.println("Constructor called");
}
{System.out.println("Another instance initializer");}

public static void main(String[]args){
{System.out.println("Fourth instance initializer");}
Chick chick = new Chick();
System.out.println(""+chick.name);
}


}
