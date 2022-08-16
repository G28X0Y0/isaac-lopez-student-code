public class Vehicle {
   private String make;
   private String model;
   private int year;
   private double price;
   private char condition;
   private int trim;
   private char transmission;
   private int mileage;

   enum Trim{
       BASE,
       MID,
       TOP
   }

   enum Transmission{
       AUTOMATIC,
       MANUAL
   }

   enum Condition {
       NEW,
       USED,
    }

   Vehicle(String make, String model, int year, double price, char transmission, char condition, int trim, int mileage){
       setMake(make);
       setModel(model);
       setYear(year);
       setPrice(price);
       setTransmission(transmission);
       setCondition(condition);
       setTrim(trim);
       setMileage(mileage);
   }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make != null)
            this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 1886)
            this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public Trim getTrim(){
       if(trim == 1)
           return Trim.BASE;
       else if(trim == 2)
           return Trim.MID;
       else
           return Trim.TOP;
    }

    public void setTrim(int trim) {
       this.trim = trim;
    }

    public getTransmission() {
        if(transmission == 'A')
            return Transmission.AUTOMATIC;
        else
            return Transmission.MANUAL;
    }

    public void setTransmission(char transmission) {
        this.transmission = transmission;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage > 0)
            this.mileage = mileage;
    }

    @Override
    public String toString() {
       return "Make: " + make + "\nModel: " + model + "\nYear: " + year
               + "\nPrice: $" + String.format("%.2f", price) + "\nTrim: " + getTrim();
    }
}
