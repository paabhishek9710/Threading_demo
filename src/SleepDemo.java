class SleepDemo{
    public static void main(String args[]) {
        try {
            System.out.print("Welcome ");
            Thread.sleep(1000);
            System.out.print("to ");
            Thread.sleep(1000);
            System.out.print("Threading demonstration in ");
            Thread.sleep(500);
            System.out.print("Java!!");
        }
        catch (InterruptedException e){}
    }
}