class Except3{

    public void SkipMultiplesOfThree() {

        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Except3 E3= new Except3();

        E3.SkipMultiplesOfThree();
    }
}