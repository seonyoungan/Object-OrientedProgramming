public class Example_04_08 {
    static void replaceSpace(char[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ')
                a[i] = ',';
        }
    }
    static void printCharArray(char[] a){
        for(int i = 0;i<a.length;i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        char c[] = {'T','H','I','S',' ','I','S',' ','M','E','.','.','.','.','I',' ','L','O','V','E',' ','G','H','O','S','T','!'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}
