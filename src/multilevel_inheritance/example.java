package multilevel_inheritance;


    class LivingThing {
        public void grow() {
            System.out.println("Living things: grows.");
        }
    }

    // Derived class (inherits from LivingThing)
    class Plant extends LivingThing {
        public void photosynthesize() {
            System.out.println("Plants: photosynthesize.");
        }
    }

    // Derived class (inherits from Plant)
    class Flower extends Plant {
        public void bloom() {
            System.out.println("Flower: blooms.");
        }
    }


