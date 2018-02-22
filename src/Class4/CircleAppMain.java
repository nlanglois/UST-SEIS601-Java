package Class4;

public class CircleAppMain{
   
     public static void main(String[] args){
         /*To-Do:
          *Using "new" to instantiate a Circle object and storing its address in a reference variable called "c1" 
          */    	     	

         Circle c1 = new Circle();

         /*
          * To-Do: 
          * 1. use the method "findArea" to find the area of circle c1 and store the area in a double variable called myCircleArea
          * 2. use the method "findCircumference" to find the circumference of circle c1 and store the circumference in a double variable called myCircleCircumference
          * */

         double myCircleArea = c1.findArea();

         double myCircleCircumference = c1.findCircumference();



    	 String circle_id = c1.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(c1));
    	 System.out.println("Area of my circle is: "+ myCircleArea);
    	 System.out.println("Circumference of my circle is: "+ myCircleCircumference);
     }
}