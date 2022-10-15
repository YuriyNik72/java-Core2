public class Main {


    static final int size=10000000;//размер массива
    static final int h=size/3;//на сколько частей делить массив
    private static float[] arr=new float[size];

    public static void main(String[] args) {
        for (int i = 0; i < size; i++) {
        arr[i]=1;
        }
        long singleTime = singleThread(arr);
        long multiTime = multiThread(arr);

        increase(singleTime, multiTime);
    }
    private static long singleThread(float[] arr) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long singleTime = System.currentTimeMillis() - start;
        System.out.printf("single thread time: %d%n", singleTime);
        return singleTime;
    }

    private static long multiThread(float[] arr) {
        float[] a = new float[h];
        float[] b = new float[h];
        float[] c = new float[h];

        long start = System.currentTimeMillis();

        System.arraycopy(arr, 0, a, 0, h);
        System.arraycopy(arr, h, b, 0, h);
        System.arraycopy(arr, h, c, 0, h);

        MyThread t1 = new MyThread("a", a);
        MyThread t2 = new MyThread("b", b);
        MyThread t3 = new MyThread("c", c);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a = t1.getArr();
        b = t2.getArr();
        c = t3.getArr();

        System.arraycopy(a, 0, arr, 0, h);
        System.arraycopy(b, 0, arr, a.length,b.length);
        System.arraycopy(c, 0, arr, b.length, c.length);

        long multiTime = System.currentTimeMillis() - start;

        System.out.printf("multi thread time: %d%n", multiTime);

        return multiTime;
    }

    /**
     * Расчитать прирост в %
     */
    private static void increase(long singleTime, long multiTime) {
        double diff = ((double) singleTime / (double) multiTime) - 1;
        int increase = (int) (diff * 100);

        System.out.printf("Прирост: %d%%%n", increase);
    }

}
