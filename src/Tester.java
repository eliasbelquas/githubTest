public class Tester {

    public static void main( String args[] ) {
        SLList test1 = new SLList(5);
        SLList test2 = new SLList(10);
        SLList test3 = new SLList(20);
        SLList test4 = new SLList(40);


        System.out.println(test1.secondLast());
        System.out.println(test1.toArray()[test1.toArray().length - 2]);

        System.out.println(test2.secondLast());
        System.out.println(test2.toArray()[test2.toArray().length - 2]);

        System.out.println(test3.secondLast());
        System.out.println(test3.toArray()[test3.toArray().length - 2]);

        System.out.println(test4.secondLast());
        System.out.println(test4.toArray()[test4.toArray().length - 2]);
    }
}
