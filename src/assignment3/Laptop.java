//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 20/06/2019
//Purpose: Laptop class
package assignment3;

public class Laptop { //declaring all the variables.
    private String laptopBrandModel;
    private String CPU;
    private String RAM;
    private String screenSize;
    private String color;
    
    private boolean touchScreen;
    private boolean addRAM;
    private boolean antivirus;
    private boolean bag;
    private boolean office;
    
    private double totalPrice; //can use this for total calculations.
    private double discountRate = 0;
    private double priceAfterDiscount;
    private double payment;
    
    String str;
    
    public Laptop() { //default constructor.
        laptopBrandModel = "";
        CPU = "";
        RAM = "";
        screenSize = "";
        color = "";
        
        this.touchScreen = false;
        this.addRAM = false;
        this.antivirus = false;
        this.bag = false;
        this.office = false;
        
        this.totalPrice = 0.0;
        this.discountRate = 0.0;
        this.priceAfterDiscount = 0.0;
        this.payment = 0.0;
    }

    //non default constructor.
    public Laptop(String laptopBrandModel, String CPU, String RAM, String screenSize, String color, boolean touchScreen, boolean addRAM, boolean antivirus, boolean bag, boolean office, double totalPrice, double discountRate, double priceAfterDiscount, double payment) {
        this.laptopBrandModel = laptopBrandModel;
        this.CPU = CPU;
        this.RAM = RAM;
        this.screenSize = screenSize;
        this.color = color;
        this.touchScreen = touchScreen;
        this.addRAM = addRAM;
        this.antivirus = antivirus;
        this.bag = bag;
        this.office = office;
        this.totalPrice = totalPrice;
        this.discountRate = discountRate;
        this.priceAfterDiscount = priceAfterDiscount;
        this.payment = payment;
    }
    
    //everything below is setter and getter.
    public String getLaptopBrandModel() {
        return laptopBrandModel;
    }

    public void setLaptopBrandModel(String laptopBrandModel) {
        this.laptopBrandModel = laptopBrandModel;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isAddRAM() {
        return addRAM;
    }

    public void setAddRAM(boolean addRAM) {
        this.addRAM = addRAM;
    }

    public boolean isAntivirus() {
        return antivirus;
    }

    public void setAntivirus(boolean antivirus) {
        this.antivirus = antivirus;
    }

    public boolean isBag() {
        return bag;
    }

    public void setBag(boolean bag) {
        this.bag = bag;
    }

    public boolean isOffice() {
        return office;
    }

    public void setOffice(boolean office) {
        this.office = office;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    public void setPriceAfterDiscount(double priceAfterDiscount) {
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
    
    //this is a method used for calculating the laptop price with it's specs.
    public double laptopCalculation () {
        
        if(laptopBrandModel.equalsIgnoreCase("ASUS - ZenBook Pro")) {
            totalPrice = 3000;
        }
        else if(laptopBrandModel.equalsIgnoreCase("Lenovo - ThinkPad Carbon")) {
            totalPrice = 4000;
        }
        else if(laptopBrandModel.equalsIgnoreCase("MSI - GP62 Leopard Pro")) {
            totalPrice = 4500;
        }
        if(CPU.equalsIgnoreCase("Core i3")) {
            totalPrice += 200;
        }
        else if(CPU.equalsIgnoreCase("Core i5")) {
            totalPrice += 400;
        }
        else if(CPU.equalsIgnoreCase("Core i7")) {
            totalPrice += 600;
        }
        if(RAM.equalsIgnoreCase("4GB")) {
            totalPrice += 200;
        }
        else if(RAM.equalsIgnoreCase("8GB")) {
            totalPrice += 300;
        }
        else if(RAM.equalsIgnoreCase("16GB")) {
            totalPrice += 500;
        }
        if(screenSize.equalsIgnoreCase("14 Inch")) {
            totalPrice += 50;
        }
        else if(screenSize.equalsIgnoreCase("15 Inch")) {
            totalPrice += 100;
        }
        
        if(isTouchScreen() == true ) {
            totalPrice += 400;
        }
        
        if(isAddRAM() == true ) {
            totalPrice += 300;
        }
        
        if(isAntivirus() == true ) {
            totalPrice += 50;
        }
        
        if(isBag() == true ) {
            totalPrice += 100;
        }
        
        if(isOffice() == true ) {
            totalPrice += 100;
        }
       
        return totalPrice;
    }
    
    public double Discount() { //this method is used for discount.
       priceAfterDiscount = totalPrice-((discountRate/100)*totalPrice);
        
       return priceAfterDiscount;
    }
    
    public double Balance() { //this method is used for the remaining Balance.
        double balance = 0;
        
        if(priceAfterDiscount > 0) {
            balance = getPayment() - Discount();
        } else {
           balance  = getPayment() - totalPrice;
        }
       
        
        return balance;
    }
    
    
    public String toString () { //to String method to display the laptop spec when the user clicks display.
        
        str = "\nLaptop Model: "+getLaptopBrandModel()+"\n" +
                "CPU: "+getCPU()+"\n" +
                "RAM: "+getRAM()+"\n" +
                "Screen Size: "+getScreenSize()+"\n" +
                "Color: "+getColor()+"\n" +
                "Touch Screen: ";
        if(touchScreen) {
            str += "Yes\n";
        } else {
            str += "No\n";
        }
        str += "\nAdditional Items: \n";
        
        str += "Additional RAM: ";
        if(addRAM) {
            str += "Yes\n";
        } else {
            str += "No\n";
        }
        
        str += "AntiVirus Software: ";
        if(antivirus) {
            str += "Yes\n";
        } else {
            str += "No\n";
        }
        
        str += "Laptop Bag: ";
        if(bag) {
            str += "Yes\n";
        } else {
            str += "No\n";
        }
        
        str += "Office Included: ";
        if(office) {
            str += "Yes\n";
        } else {
            str += "No\n";
        }

     return str;       
    }
    
    public void equalTo(Laptop laptop2) { //for the assigning of the laptop objects that was used in the Sales class.
        laptopBrandModel = laptop2.laptopBrandModel;
        CPU = laptop2.CPU;
        RAM = laptop2.RAM;
        screenSize = laptop2.screenSize;
        color = laptop2.color;
        touchScreen = laptop2.touchScreen;
        addRAM = laptop2.addRAM;
        antivirus = laptop2.antivirus;
        bag = laptop2.bag;
        office = laptop2.office;
    
        totalPrice = laptop2.totalPrice;
        discountRate = laptop2.discountRate;
        priceAfterDiscount = laptop2.priceAfterDiscount;
        payment = laptop2.payment;
    }
    
    
}
