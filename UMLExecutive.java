public class UMLExecutive extends UMLPassenger {
    public int seatCapacity;
    public int foodMenu;

    public UMLExecutive () {
        super();
        seatCapacity = 25;
        foodMenu = 10;
    }

    public UMLExecutive(String name, int age, char gender, int num, int amt, double price, int seatCapacity, int foodMenu) {
        super(name, age, gender, num, amt, price);
        this.seatCapacity = seatCapacity;
        this.foodMenu = foodMenu;
    }

    public int getseatCapacity() {
        return seatCapacity;
    }
    public void setseatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
    public int getfoodMenu() {
        return foodMenu;
    }
    public void setfoodMenu(int foodMenu) {
        this.foodMenu = foodMenu;
    }
    
    public void displayexecutive(){
        super.display();
        System.out.println("Seat Capacity: "+seatCapacity);
        System.out.println("How many food Menus: "+foodMenu);
    }
}


