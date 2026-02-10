package String;

public class PerformanceComparison {

    static void main(String[] args) {

        long startTime, endTime ;

        // Using String
        startTime = System.nanoTime();
        String str = "Java";
        for(int i = 0; i < 100000; i++) {
            str += "Programming";
        }
        endTime = System.nanoTime();
        long totalStringTime = endTime - startTime;

        // Using StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++) {
            sb.append("Programming");
        }
        endTime = System.nanoTime();
        long totalSBTime = endTime - startTime;

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            sbf.append("Programming");
        }
        endTime = System.nanoTime();
        long totalSBFTime = endTime - startTime ;

        System.out.println("Avg String Time: " +  (totalStringTime / 10) + "ns");
        System.out.println("Avg StringBuilder Time: " + (totalSBTime / 10) + "ns");
        System.out.println("Avg StringBuffer Time: " + (totalSBFTime / 10) + "ns");

    }
}
