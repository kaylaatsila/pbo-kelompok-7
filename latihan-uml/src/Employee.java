abstract class Employee {
    protected String name = "";
    protected String afm = "";

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String a) {
        afm = a;
    }

    abstract int payment();
}
