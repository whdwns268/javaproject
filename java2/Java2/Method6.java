package Java2;

import java.util.Arrays;

public class Method6 {
    // 배열 데이터를 이용하여 홀수값에 대한 총 갯수 받기 (응용)
    public static void main(String[] args) {
        mysql m = new mysql();
        int number = m.check("홀수");
        System.out.printf("총 갯수는 %d입니다.", number);
    }
}

class mysql {

    private int datas[] = {15, 22, 17, 14, 32, 35, 19, 33};

    /*
     * 응용문제3.
     * 협업프로그래머가 해당 db(database)에 값 중 홀수값에 대한 총 갯수를 받고자 합니다.
     * 해당 갯수를 출력 될 수 있도록 코드를 작성하시오.
     */
    public int check(String number) {

        int ea = datas.length;
        int count = 0;

        for (int i = 0; i < ea; i++) {
            if (number.equals("홀수")) { 
                if (datas[i] % 2 == 1) {
                    count++;
                }
            } else if (number.equals("짝수")) {
                if (datas[i] % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}