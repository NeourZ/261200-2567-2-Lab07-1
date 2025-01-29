import java.util.*;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! " + args[0] + " , " + args[1]);

        List<String> aList = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            aList.add(args[i]);
        }
        System.out.println(aList);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);

        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        System.out.println(hSet);

        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        System.out.println(sSet);

        Stack<String> stacko = new Stack<>();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        System.out.println(stacko.pop());
        System.out.println(stacko);

        Map<String, Color> favoriteColors = new HashMap<String, Color>();
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.YELLOW);
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);

        System.out.println(favoriteColors);

        Set<String> keySet = favoriteColors.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + favoriteColors.get(key));
        }
        
        Map<String, Color> favoriteColorsTree = new TreeMap<>(favoriteColors);
        System.out.println("TreeMap: " + favoriteColorsTree);

        Set<String> keySetTree = favoriteColorsTree.keySet();
        
        for (String key : keySetTree) {
            System.out.println(key + " : " + favoriteColorsTree.get(key));
        }
    }
}