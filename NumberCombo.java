
package number.combo;

public class NumberCombo {

  
    public static void main(String[] args) {
        
    //variable a stores incremental value of number of combinations
        int a = 0;
        for (int i = 1; i <= 7; i++) {

            for (int j = 0; j <= 7; j++) {

                // if statement checks that same combination doesnt occur irrespppective of the order of digits
                if (j < i) {
                    continue;
                } else {

                    // if statement checks same digits are not selected in combination
                    if (i != j) {
                        System.out.println(i + ", " + j);
                        a = a + 1;
                    } else {
                        continue;
                    }
                }


            }

        }
        System.out.println("Total number of combinations is " + a);
    }
}
