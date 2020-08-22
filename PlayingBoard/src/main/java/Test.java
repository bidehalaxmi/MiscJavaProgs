public class Test implements Runnable {
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Test());
        t1.start();
        //t1.start();
        System.out.println(t1.getState());

        MyMathFunc sub = (a,b) -> (a-b);
        //MyMathFunc sub2 = a,b -> (a-b);
        MyMathFunc sub3 = (a,b) -> a-b;
        MyMathFunc sub4 = (int a, int b) -> a-b;
        //MyMathFunc sub5 = (int a, int b) -> return(a-b);

        //Multi m1 = (x,y) -> return x*y;
        Multi m1 = (x,y) -> {return x*y;};
        //() -> {};
        //() -> "Roul";
        //(Integer i) -> return "yes" + i;
        //(String i) ->{"yes" + i;};

    }
}

interface MyMathFunc{
    int operation(int a, int b);
}

class TestInteface implements MyMathFunc{

    public int operation(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {

    }
}

interface Multi{
    public int multiply(int p1, int p2);
}