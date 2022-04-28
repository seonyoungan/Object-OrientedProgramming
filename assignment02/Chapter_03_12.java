public class Chapter_03_12 {
    public static void main(String[] args) {
        int[] intNum = new int[args.length];
        for(int i = 0; i < args.length;i++){
            try{
                intNum[i] = Integer.parseInt(args[i]); //integer만..
            }
            catch(NumberFormatException e){
            }
        }

        int result = 0;
        for(int i = 0; i < args.length;i++){
            result += intNum[i];
        }
        System.out.println(result);
    }
}
