package array;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListClass {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
			//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		 HDTV tv1 = new HDTV(62, "Samsung"); //created three objects for the HDTV  class 
		  HDTV tv2 = new HDTV(38, "Reliance"); //and initializing the values in it 
		  HDTV tv3 = new HDTV(48, "Panasonic");
		  
		  //creating an ArrayList for HDTV class 
		  ArrayList<HDTV> arraylist = new ArrayList<HDTV>(); 
		  arraylist.add(tv1);  //here passing the objects of the hdtv class in the arraylist 
		  arraylist.add(tv2);
		  arraylist.add(tv3);
		 
		  System.out.println("HDTV objects which are sorted in order :");
		  Collections.sort(arraylist, new SizeComparator()); //here it sorts the elements in the arraylist by the size of comparator 
		 // The Java collections framework (JCF) is a set of classes and interfaces that implement commonly reusable collection data structures. 
		  for (HDTV list : arraylist ) {      //here by using for each loop the elements will be sorted by the size and prints the brand names in the 
		   System.out.println(list.getBrand()); //sorted order 
		   //system is final class
		      //out is a static member of system class and type printStream
		      //println is method of printStream class.ln means nextline
		  }
	

}}
