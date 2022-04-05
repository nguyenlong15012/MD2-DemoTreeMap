public class Student {
    private int id;
    private Language language;
    private String name;


    public Student() {
    }

    public Student(int id, Language language, String name) {
        this.id = id;
        this.language = language;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", language=" + language.getLanguage() +
                ", name='" + name + '\'' +
                '}';
    }
}
