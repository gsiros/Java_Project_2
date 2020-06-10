public class TaktikiApodoxi extends StoixeioErgasias {

    private double percentage;
    private int id;
    private static int idMaker;

    public TaktikiApodoxi(){
        super();
    }

    @Override
    public double getSyntelesths() {
        return percentage;
    }
    public TaktikiApodoxi(String description, double percentage){
        super(description);
        this.percentage = percentage;
        this.id = idMaker++;
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "(Τακτική Αποδοχή): " + " ID: "+id+ super.toString();
    }
}
