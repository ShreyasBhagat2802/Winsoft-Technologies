class Question_4 {
    public static void Duplicate(String str) {
        str = str.toLowerCase();
        char Arr[] = str.toCharArray();

        int i = 0;
        int j = 0;
        int counter = 0;
        System.out.println("Duplicate characters in a given string are: ");
        for (i = 0; i < Arr.length; i++) {
            counter = 1;
            for (j = i + 1; j < Arr.length; j++) {
                if (Arr[i] == Arr[j] && Arr[i] != ' ') {
                    counter++;
                    Arr[j] = '0';
                }
            }
            if (counter > 1 && Arr[i] != '0') {
                System.out.println(Arr[i]);
            }
        }
    }

    public static void main(String arg[]) {

        String str = "My name is Shreyas Bhagat";
        Duplicate(str);
    }

}
