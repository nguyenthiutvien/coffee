		/**
 * 
 */
package Exercise2_4;

		/**computes the cost of selling bulkcoffee at a specialty coffee seller
		 * @author Nguyễn Viên
		 *
		 */
public class Coffee {
	String kind;
	double price;
	int weight;
		/**This is Coffee's constructor to create coffee object which input:
		  * @param kind : String, Coffee's kind
		  * @param price: double , Coffee's price
		  * @param weight: int, Coffee's weight 
		  * 
		  */
	 
public Coffee(String kind, double price, int weight) {
		this.kind = kind;
		this.price = price;
		this.weight = weight;
	}

		/**
		 *cost which computes the cost of selling bulkcoffee at a specialty coffee without discount
		 * @return double (cost of Coffee) 
		 * Example: 
		 * new Coffee("Hawaiian Kona", 15.95, 100).cost(), 1595.0
		 * Coffee c1 = new Coffee("Ethiopian", 8.0, 1000);
		 * Coffee c2 = new Coffee("Colombian Superme", 12.0, 1700);
		 * c1.cost(),8000.0
		 * c2.cost(),20400.0
		 *         
	     */
double cost() {
		return this.price * this.weight;
	}

		/**
		 * costDiscount which computes the cost takes into a ccount bulk discounts:
		 * If the sale is for less than 5,000 pounds, there is no discount 
		 * For sales of 5,000 pounds to 20,000 pounds the seller grants a discount of 10%
		 * For sales of 20,000 pounds or more, the discount is 25%
		 * @return double 
		 * Example:
		 * new Coffee("Hawaiian Kona", 15.95, 100).costDiscount(), 1595.0
		 * Coffee c1 = new Coffee("Ethiopian", 8.0, 1000);
		 * Coffee c2 = new Coffee("Colombian Superme", 12.0, 1700);
		 * c1.costDiscount(),7200.0
		 * c2.costDiscount(),15300.0
		 */

double costDiscount() {
		if (this.cost() < 5000) {
			return this.cost();
		}
		if (this.cost() >= 5000 && this.cost() < 20000) {
			return  this.cost()- this.cost() * 0.1;
		}
		return this.cost()- this.cost() * 0.25;
	}
}