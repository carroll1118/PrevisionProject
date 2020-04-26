package dataset;

abstract class Function{
    abstract double run(double[] data);
}



//class Avg extends Function{
//    double run(double[] data) {
//        double res = 0;
//        for ( int i = 0; i < data.length; ++i ) {
//            res += data[i];
//        }
//        return res / data.length;
//    }
//}

class Variation extends Function{

    @Override
    double run(double[] data) {
        double res = 0;
        for ( int i = 0; i < data.length; ++i ) {
            res += data[i];
        }
        double average = res / data.length;
        for (int i = 0; i < data.length; ++i){
            res += Math.pow(data[i]-average,2);
        }
        return res;
    }

}

public class DataSet {
    private double[] data;
    public DataSet(double[] data) {
        this.data = data;
    }


    public static void main(String[] args) {
        double[] data = new double[100];
        for ( int i = 0; i < 100; ++i ) {
            data[i] = i;
        }
       // DataSet ds = new DataSet(data);
        Variation ds = new Variation();
        System.out.println(ds.run(data));
       // System.out.println();
       /* System.out.println(ds.cal(new Fun() {

            @Override
            public double run(double[] data) {
                double res = 0;
                for ( int i = 0; i < data.length; ++i ) {
                    res += data[i];
                }
                return res;
            }

        }));*/
    }

}

