package heirarchical_inheritence;

class Flower {

    public void display() {
        System.out.println("This is a flower.");
    }
}

class Rose extends Flower {

    @Override
    public void display() {
        System.out.println("This is a rose.");
    }
}

class Tulip extends Flower {

    @Override
    public void display() {
        System.out.println("This is a tulip.");
    }
}
