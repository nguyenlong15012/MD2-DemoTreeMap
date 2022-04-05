import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Student stu1 = new Student(1, new Language("Java"), "Nguyễn Bá Long");
        Student stu2 = new Student(2, new Language("PHP"), "Nguyễn Bá Thao");
        Student stu3 = new Student(3, new Language("Ruby"), "Nguyễn Bá Nguyện");
        Student stu4 = new Student(4, new Language("Java"), "Nguyễn Bá Luynh");
        Map<Integer, Language> map = new HashMap<>();

        map.put(stu1.getId(), stu1.getLanguage());
        map.put(stu2.getId(), stu2.getLanguage());
        map.put(stu3.getId(), stu3.getLanguage());
        map.put(stu4.getId(), stu4.getLanguage());
        System.out.println("Nhập ID");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        System.out.println(map.get(id));
    }
}
