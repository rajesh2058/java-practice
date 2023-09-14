class again {
    int number = 5;
}

public class reusability extends again {
    void ram() {
        int count = 4;
        int multiply = count * number;
        System.out.println("number is:" + multiply);
    }

    public static void main(String[] args) {
        reusability A = new reusability();
        A.ram();
    }
}


