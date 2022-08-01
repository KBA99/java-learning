package Section5;

public class PaintJob {

    public static int getBucketCount(double area, double areaPerBucket){
        if( area < 0) {
            return -1;
        }

        return (int) (area / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width < 0 || height < 0  || areaPerBucket < 0) {
            return -1;
        }

        double coveredArea = areaPerBucket * extraBuckets;
        double totalArea = width * height;

        int paintRequired = (int) Math.ceil((totalArea - coveredArea) / areaPerBucket);

        return paintRequired;
    }
}
