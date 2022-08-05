package Section5;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int BIG_PACK = 5;
        int SMALL_PACK = 1;
        int sum = bigCount * BIG_PACK + smallCount * SMALL_PACK;

        return goal <= sum && goal % 5 <= smallCount;
    }
}
