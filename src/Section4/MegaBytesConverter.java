package Section4;

public class MegaBytesConverter {
    public static final int MB_TO_KB = 1024;

    public static void printMegaBytesAndKiloBytes(int kilobytes) {

        if(kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = Math.round(kilobytes / MB_TO_KB);
            int remainingKb = kilobytes % MB_TO_KB;
            System.out.println(kilobytes + " KB = " + megabytes + " MB and " + remainingKb + " KB");
        }
    }
}
