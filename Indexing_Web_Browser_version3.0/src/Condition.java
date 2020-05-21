public class Condition {

    private String attribute;
    private String operator;
    //private double data;
    private String data;

    public Condition(){

        attribute = "";
        operator = "";
        //data = 0.0;
        data = "";

    }

    //public Condition(String attribute, String operator, double data){
    public Condition(String attribute, String operator, String data){
        this.attribute = attribute;
        this.operator = operator;
        this.data = data;

    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
