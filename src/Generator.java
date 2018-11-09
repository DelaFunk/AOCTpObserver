public interface Generator {

    public void attach(Observer o);
    public void detach(Observer o);
    public int getValue();
}
