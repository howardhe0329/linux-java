package me.howard.linux.threads;

/**
 * 创建大量线程
 *
 * @author howard he
 * @create 2018-12-20 14:21
 */
public class ThreadsDemo {

    public static void main(String[] args) {
        int threadCount = 10;
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].contains("-n")) {
                    threadCount = Integer.valueOf(args[i + 1]);
                }
            }
        }
        for (int i = 0; i < threadCount; i++) {
            new Thread(() -> {
                int sum = 0;
                while (true) {
                    sum++;
                }
            }).start();
        }
    }

}
