public class Question_2 {

    public static int MaxSumPath(int Ar[], int Br[]) {
        int alength = Ar.length;
        int blength = Br.length;

        int i = 0;
        int j = 0;
        int Asum = 0;
        int Bsum = 0;
        int Maxsum = 0;
        StringBuilder path = new StringBuilder();

        while (i < alength && j < blength) {
            if (Ar[i] < Br[j]) {
                Asum = Asum + Ar[i];
                path.append(Ar[i]).append(" ->");
                i++;
            } else if (Ar[i] > Br[j]) {
                Bsum = Bsum + Br[j];
                path.append(Br[j]).append(" ->");
                j++;
            } else {
                Maxsum = Maxsum + Math.max(Asum, Bsum) + Ar[i];
                path.append(Ar[i]).append(" ->");
                Asum = 0;
                Bsum = 0;
                i++;
                j++;
            }
        }

        while (i < alength) {
            Asum = Asum + Ar[i];
            path.append(Ar[i]).append(" ");
            i++;
        }

        while (j < blength) {
            Bsum = Bsum + Br[j];
            path.append(Br[j]).append(" ->");
            j++;
        }
        Maxsum = Maxsum + Math.max(Asum, Bsum);
        System.out.println("The maximum sum path is:: " + path.toString());
        return Maxsum;
    }

    public static void main(String Arg[]) throws Exception {
        int[] X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };
        int Maxsum = 0;

        Maxsum = MaxSumPath(X, Y);
        System.out.println("The maximum sum is : " + Maxsum);
    }

}