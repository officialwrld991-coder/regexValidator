public class Multiple {
    public static int[] getNumberSqaure(int[] number) {
        int[] answer = new int[number.length];

        for (int count = 0; count < number.length; count++) {

            answer[count] = number[count] *  number[count];
        }
        for (int count = 0; count < answer.length; count++) {
            for(int index = 0; index < answer.length; index++) {
              if(answer[count] < answer[index]) {
                  int temp = answer[count];
                  answer[count] = answer[index];
                  answer[index] = temp;
              }
            }
        }
        return answer;
    }
}
