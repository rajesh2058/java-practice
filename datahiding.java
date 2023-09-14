class Animal {
    String name= "Animal";
}

class datahiding extends Animal {
    String name = "Dog";

    public static void main(String[] args) {
        datahiding myDog = new datahiding();
        Animal myAnimal = myDog; // Upcasting //we assign dog class object to animal class where 
         // instance variable is same and can't access for subclass so its perfect data hiding

        System.out.println("Dog's name: " + myDog.name);       // Outputs "Dog"
        System.out.println("Animal's name: " + myAnimal.name); // Outputs "Animal"
    }
}


        
