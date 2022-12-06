package week09_11_05_2022;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4,5,6};
        int[] thirdArray = {7,8,9,10};

        int[] [] twoDimenArray = {

                {1, 2, 3},
                {4, 5, 6 },
                {7, 8, 9, 10},

    };
        int[][] array2D = {firstArray, secondArray, thirdArray};
        System.out.println(twoDimenArray[0][1]);

        System.out.println("twoDimenArray[2][2] = " + twoDimenArray[2][2]);

        for (int i = 0; i < twoDimenArray.length; i++) {

            for (int j = 0; j < twoDimenArray[i].length; j++) {

                System.out.println(twoDimenArray[i][j]);


            }
            System.out.println("=============");
        }
int [][][] array3D = {
        {
                {12,3},
                {4,5,6},
        },
        {
                 {12,3},
                  {4,5,6},
        }
         };

    }
}
