package zookeeperpackage;

public class Driver {

	public static void main(String[] args) {
 Gorilla gorilla1 = new Gorilla();
 
 gorilla1.throwSomthing();
 gorilla1.throwSomthing();
 gorilla1.throwSomthing();

 gorilla1.eatBananas();
 gorilla1.eatBananas();
 gorilla1.eatBananas();
 
 gorilla1.climb();
 
 System.out.println(gorilla1.displayEnergy());
 
 Bat bat = new Bat();
 
 bat.atackTown();
 bat.atackTown();
 bat.atackTown();
 
 bat.eatHmans();
 bat.eatHmans();
 
 bat.fly();
 bat.fly();
 
 bat.displayEnergy();

	}
}
