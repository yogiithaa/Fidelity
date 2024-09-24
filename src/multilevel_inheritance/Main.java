package multilevel_inheritance;

public class Main {

        public static void main(String[] args) {
            // Create an instance of the Flower class
            Flower myFlower = new Flower();

            // Call methods from the Flower and its parent classes
            myFlower.grow();           // Inherited from LivingThing class
            myFlower.photosynthesize(); // Inherited from Plant class
            myFlower.bloom();           // Defined in Flower class
        }
    }


