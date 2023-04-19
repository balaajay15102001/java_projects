import java.util.*;

public class d4t4p1 {
        static Map<String, Integer> Ranks = new HashMap<String, Integer>();
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter Student " + i + " name :");
                String name = in.nextLine();
                System.out.print("Enter Student " + i + " score :");
                int score = in.nextInt();
                in.nextLine();
                Ranks.put(name, score);
            }

            List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(Ranks.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
            {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
                {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
            for (Map.Entry<String, Integer> entry : list)
            {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
            int i=1;
            for (Map.Entry<String, Integer> entry : sortedMap.entrySet())
            {
                System.out.println("********Rank "+i+++"*********");
                System.out.println("\t"+entry.getKey() +"\t"+entry.getValue());
            }
            System.out.println("\n");
        }
    }

