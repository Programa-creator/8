public class Main {
    public static void main(String[] args){
        String[][] array = {
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"}};

        ArrayValueCalculator a = new ArrayValueCalculator();
        try {
            System.out.println(a.doCalc(array));
        }
        catch (ArraySizeException | ArrayDataException e){
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}