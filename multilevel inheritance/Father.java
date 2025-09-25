public class Father extends Grandfather {
    protected String profession;
    Father(String name, String profession) {
        super(name);
        this.profession = profession;
    }
    void showProfession() {
        System.out.println("Profession: " + profession);
    }
}
