package Class4;

class Circle {

      double radius = 5.0;

		/*To-Do:
		 * Create a method called findArea. 
		 * Return data type: double
		 * return the area of the circle. 
		 * Input parameters: none
		 * The formula is radius * radius * Math.PI 
		 * */

		public double findArea() {
			return radius * radius * Math.PI;
		}


		/*To-Do:
		 * Create a method called findCircumference. 
		 * Return data type: double
		 * return the circumference of the circle. 
		 * Input parameters: none
		 * The formula is 2 * radius * Math.PI 
		 * */

		public double findCircumference() {
			return 2 * radius * Math.PI;
		}

}