package kyu7;

public class RunRunner {

    private static class Logan5 implements Runnable {
        public void run() {
            System.out.println("Hello from Logan5");
            ThreadUtil.method1();
        }
    }

    private static class Jessica6 implements Runnable {
        public void run() {
            System.out.println("Hello from Jessica6");
            ThreadUtil.method2();
        }
    }

    public static void runRunners() {
        new Thread(new Logan5()).run();
        new Thread(new Jessica6()).run();
    }

    public static class ThreadUtil {
        public static void method1() {
            System.out.println("Logan5 is running");
        }

        public static void method2() {
            System.out.println("Jessica6 is running");
        }

        public static boolean checkThreads() {
            return Thread.activeCount() == 2;
        }
    }
}
