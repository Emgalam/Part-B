package module;

import java.util.*;

public class BMIAnalyser {
    private BMIRecord[] data;
    private int nrecords;

    public BMIAnalyser() {
        getData();
        loadFromTables();
    }

    public BMIRecord find(String sid) {
        for (BMIRecord brd : data
        ) {
            if (brd.getSubjectid().equals(sid)) {
                return brd;
            }
        }
        return null;
    }

    public ArrayList<BMIRecord> find(double bmi1, double bmi2) {
        ArrayList<BMIRecord> alr = new ArrayList<>();
        for (BMIRecord brd : data
        ) {
            if (brd.getBmiValue() > bmi1 && brd.getBmiValue() < bmi2) {
                alr.add(brd);
            }
        }
        return alr;
    }

    public int getNrecords() {
        return nrecords;
    }

    public double lowestBMI() {
        double lowest = Double.MAX_VALUE;
        boolean isChange = false;
        for (BMIRecord brd : data
        ) {
            if (brd.getBmiValue() < lowest) {
                isChange = true;
                lowest = brd.getBmiValue();
            }
        }
        if (!isChange) return 0.0;
        else
            return lowest;
    }

    public double highestBMI() {
        double highest = Double.MIN_VALUE;
        boolean isChange = false;
        for (BMIRecord brd : data
        ) {
            if (brd.getBmiValue() > highest) {
                isChange = true;
                highest = brd.getBmiValue();
            }
        }
        if (!isChange) return 0.0;
        else
            return highest;
    }

    public double averageBMI() {
        double total = 0.0;

        for (BMIRecord brd : data
        ) {
            total = total + brd.getBmiValue();
        }
        try {
            double average = total / data.length;
            return average;
        } catch (Exception e) {
            return 0.0;
        }
    }

    //TODO
    public BMIRecord[] getData() {
        data = new BMIRecord[2];
        data[0] = new BMIRecord("S01", 0, 0, 0, "none");
        data[1] = new BMIRecord("S02", 0, 0, 0, "none");
        return data;
    }
    //TODO
    //TEST
   public void sortByID() {
       List<BMIRecord> list = new ArrayList();
       list.addAll(Arrays.asList(data));
       Collections.sort(list, new Comparator() {
           @Override
           public int compare(Object bmiRecord, Object softDrinkTwo) {

               return(new String(((BMIRecord)bmiRecord).getSubjectid()))
                       .compareTo(((BMIRecord)bmiRecord).getSubjectid());
           }
       });
       data = list.stream().toArray(BMIRecord[]::new);
    }
    //TODO
    private void loadFromTables() {
        String[] subjects = {
                // your values go here
        };
        double[] height = {
                // your values go here
        };
        double[] weight = {
                // your values go here
        };
        nrecords = subjects.length;
        data = new BMIRecord[nrecords];
        for (int i = 0; i < nrecords;
             i++) {
            double v = weight[i] / (height[i] * height[i]);
            String c = classify(v);
            BMIRecord r = new BMIRecord(
                    subjects[i], height[i], weight[i], v, c);
            data[i] = r;
        }
    }
    //TODO
    private String classify(double v) {
        return "";
    }
}
