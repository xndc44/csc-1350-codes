
public class Car implements Comparable<Car> {
    private String make;
    private int year;
    private int price;

    public Car(String make, int year, int price) {
        this.make = make;
        this.year = year;
        this.price = price;
    }//car

   
    public String getMake() {
        return make;
    }//string
  
    public int getYear() {
        return year;
    }//int

  
    public int getPrice() {
        return price;
    }//price

    
    public int compareTo(Car other) {
        int makeComparison = this.make.compareTo(other.make);

        if (makeComparison != 0) {
            return makeComparison;
        }//if
        else {
            if (this.year != other.year) {
                return this.year - other.year;
            }//if
            
            else {
                return 0;
            }//else
        }//else
    }//int

   
    public String toString() {
        return String.format("Make: %s, Year: %s, Price: %s;", this.make, this.year, this.price);
    }//tostring
}//class
