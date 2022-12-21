public class ArrayValueCalculator {

    int doCalc(String[][] array)throws Exception{
        if(array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException();
        }
            int sum = 0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                 try {
                     sum += Integer.parseInt(array[i][j]);
                 }catch (NumberFormatException e){
                     throw new ArrayDataException();
                 }
                }
            }
            return sum;
    }
}
