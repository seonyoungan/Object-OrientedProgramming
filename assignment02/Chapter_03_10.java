public class Chapter_03_10 {
    public static void main(String[] args) {
        int count=0;
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10 + 1); //랜덤값 생성
            }
        }

        while(count<6){ //6개의 숫자를 0으로 만들기
            int random_1 = (int)(Math.random()*3);
            int random_2 = (int)(Math.random()*3);
            if(array[random_1][random_2] != 0) {
                array[random_1][random_2] = 0;
                count++;
            }
        }

        for (int i = 0; i < array.length; i++) { //출력
            for (int j = 0; j < array[i].length; j++) {
                if (j % 4 == 0)
                    System.out.println();
                System.out.print(array[i][j]+" ");
            }
        }
    }
}