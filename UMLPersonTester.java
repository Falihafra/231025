public class UMLPersonTester {
    public static void main (String[] args){
    umlperson Fatih = new umlperson();
    Fatih.display();
    
    umlperson Budi = new umlperson("Budi", 25, 'M');
    Budi.display();

    umlperson Siti = new umlperson("Siti", 22, 'F');
    Siti.display();

    UMLPassenger Andre = new UMLPassenger();
    Andre.displayPassanger();

    UMLEmployee Andi = new UMLEmployee();
    Andi.displayEmployee();
    }
} 
