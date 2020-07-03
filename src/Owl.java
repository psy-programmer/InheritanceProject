public class Owl extends Bird {
    @Override
    public void voice() {
        System.out.println("uhuu...");
    }

    @Override
    protected void movement() {
        System.out.println("fly....");
    }
}
