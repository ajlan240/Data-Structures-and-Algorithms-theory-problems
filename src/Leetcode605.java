public class Leetcode605 {
    public static void main(String[] args) {
        int[] bed = {0};
        System.out.println(canPlaceFlowers(bed, 1));
    }
    public static boolean canPlaceFlowers(int[] flowerBed, int n) {
        int k = 0;
        int i = 0;
        if(flowerBed.length == 1) k = flowerBed[0] == 0 ? 1 : 0;
        while(i < flowerBed.length - 1){
            if(flowerBed[i] == 0 && flowerBed[i + 1] == 0){
                if(i >= 1){
                    if(flowerBed[i - 1] == 0) {
                        flowerBed[i] = 1;
                        k++;
                    } else if (i + 1 == flowerBed.length - 1) {
                        flowerBed[i] = 1;
                        k++;
                    }
                } else {
                    flowerBed[i] = 1;
                    k++;
                }
            }
            i++;
        }
        return k >= n;
    }
}
