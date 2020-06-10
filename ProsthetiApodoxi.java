public class ProsthetiApodoxi extends MisthologikoStoixeio {

    private int id;
    private static int idMaker;

    public ProsthetiApodoxi(){
        super();
    }

    public ProsthetiApodoxi(String description){
        super(description);
        this.id = idMaker++;
    }

    @Override
    public String toString(){
        return "(Πρόσθετη Αποδοχή):" +" ID: " + id + super.toString();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getSyntelesths() {
        return 1;
    }
}
