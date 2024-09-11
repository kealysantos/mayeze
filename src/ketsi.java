public class ketsi {
    static int x = 0;
    int m = 40;

    public ketsi() {
    }

    public void kea() {
        int w = 8;
        ++x;
        System.out.println("static:" + x);
        ++this.m;
        System.out.println("Instances:" + this.m);
        System.out.println("Local variable:" + w);
    }

    public static void main(String[] args) {
        ketsi k = new ketsi();
        k.kea();
    }
}
