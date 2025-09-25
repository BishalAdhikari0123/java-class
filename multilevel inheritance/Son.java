public class Son extends Father {
    private String hobby;

    Son(String name, String profession, String hobby) {
        super(name, profession);
        this.hobby = hobby;
    }

    void showHobby() {
        System.out.println("Hobby: " + hobby);
    }

    public static void main(String[] args) {
        Son obj = new Son("Smith", "Engineer", "Photography");
        obj.showFamilyName();
        obj.showProfession();
        obj.showHobby();
    }
}
