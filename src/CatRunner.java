public class CatRunner {
    public static void main(String[] args){

        Cat cat1 = new Cat("Fluffy", 2, 10.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Snowball", 9, 15.2);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
