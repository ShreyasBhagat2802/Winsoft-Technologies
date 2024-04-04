public class Question_1 {
    public static void SortArray(int Ar[], int Br[]) {
        int point = 0;
        for (int i = 0; i < Ar.length; i++) {
            if (Ar[i] == 0) {
                Ar[i] = Br[point];
                point = point + 1;
            }
        }
        int i = 0, j = 0;
        for (i = 1; i < Ar.length; i++) {
            j = i - 1;
            int Temp = Ar[i];
            while (j >= 0 && Ar[j] > Temp) {
                Ar[j + 1] = Ar[j];
                j--;
            }
            Ar[j + 1] = Temp;
        }

    }

    public static void main(String arg[]) {
        int Ar[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int Br[] = { 1, 8, 9, 10, 15 };

        SortArray(Ar, Br);

        for (int i = 0; i < Ar.length; i++) {
            System.out.print(Ar[i] + " ");
        }
    }
}
