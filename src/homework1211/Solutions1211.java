package homework1211;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solutions1211 {

    public ArrayList<Integer> bubble(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();
        int minimal = Integer.MAX_VALUE;

        while (list.size() > 0) {
            for (Integer num : list) {
                if (num < minimal) {
                    minimal = num;
                }
            }
            result.add(minimal);
            list.remove(Integer.valueOf(minimal));
            minimal = Integer.MAX_VALUE;
        }
        return result;
    }

    public int countPlatform(double[] arrival, double[] departure) {

        class TimeAction {

            double time;
            int action;

            public TimeAction(double time, int action) {
                this.time = time;
                this.action = action;
            }
        }

        ArrayList<TimeAction> timeline = new ArrayList();

        for (double arr : arrival) {
            TimeAction ta = new TimeAction(arr, 1);
            timeline.add(ta);
        }

        for (double dep : departure) {
            TimeAction ta = new TimeAction(dep, -1);
            timeline.add(ta);
        }

        int result = 0;
        int maxPlatform = 0;
        timeline.sort(new Comparator<TimeAction>() {
            @Override
            public int compare(TimeAction o1, TimeAction o2) {
                return (int)o1.time - (int)o2.time;
            }
        });

        for (TimeAction ta : timeline) {
            System.out.println(Double.toString(ta.time) + ' ' + ta.action);
            result = result + ta.action;
            if (result > maxPlatform) {maxPlatform = result;}
        }

        return maxPlatform;

    }


}

class Main3 {

    public static void main(String[] args) {

        ArrayList testList = new ArrayList(Arrays.asList(7, 4, 2, 1, 0, 8));
        System.out.println(new Solutions1211().bubble(testList));

        double[] arrival = {1.00, 1.40, 1.50, 2.00, 2.15, 4.00};
        double[] departure = {1.10, 3.00, 2.20, 2.30, 3.15, 6.00};

        System.out.println(new Solutions1211().countPlatform(arrival, departure));

    }

}