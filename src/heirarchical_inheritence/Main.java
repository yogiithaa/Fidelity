package heirarchical_inheritence;
public class Main {

        public static void main(String[] args) {

            Flower myRose = new Rose();
            Flower myTulip = new Tulip();

            myRose.display();  // Calls the overridden method in Rose class
            myTulip.display(); // Calls the overridden method in Tulip class
        }
}

