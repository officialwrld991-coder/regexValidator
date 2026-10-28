import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Nothing {
    static void main() {
        Object [] getat = {"ada", "Tunde", 42};


        for (int index = 0; index < getat.length; index++) {
            String count = "" +  getat[index];
            System.out.println(count.length());
        }

        String [] names = {"Ada", "Tunde"};
        String [] newNames = new String[names.length + 1];
        newNames[0] = names[0];
        newNames[1] = names[1];
        newNames[2] = "Zainab";
        System.out.println(newNames.length);

        List<String> list = new ArrayList<>(List.of("a", "b", "c" , "d"));
        try {
            for (String s : list) {
                if (s.equals("b")) list.remove(s);
            }
        }catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }

        List<String> students = new ArrayList<>(List.of("Ada", "Tunde", "Zainab" , "Bola", "Emeka"));

        students.add(0,"Ife");

        System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
            for (int j = i + 1; j < students.size(); j++) {
                for (int k = j + 1; k < students.size(); k++) {}
            }
        }
    }

}
