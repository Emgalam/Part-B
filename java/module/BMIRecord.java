package module;

public class BMIRecord {
    private String subjectid;
    private double height;
    private double weight;
    private double bmiValue;
    private String category;

    public BMIRecord(String subjectid, double height, double weight, double bmiValue, String category) {
        this.subjectid = subjectid;
        this.height = height;
        this.weight = weight;
        this.bmiValue = bmiValue;
        this.category = category;
    }

    public double getBmiValue() {
        return bmiValue;
    }

    public void setBmiValue(double bmiValue) {
        this.bmiValue = bmiValue;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }
}
