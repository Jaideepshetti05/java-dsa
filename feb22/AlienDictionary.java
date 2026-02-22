import java.util.*;

public class AlienDictionary {
    public static String alienOrder(String[] words) {
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();

        for (String word : words)
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new HashSet<>());
                indegree.putIfAbsent(c, 0);
            }

        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i], w2 = words[i+1];
            for (int j = 0; j < Math.min(w1.length(), w2.length()); j++) {
                if (w1.charAt(j) != w2.charAt(j)) {
                    if (graph.get(w1.charAt(j)).add(w2.charAt(j)))
                        indegree.put(w2.charAt(j), indegree.get(w2.charAt(j)) + 1);
                    break;
                }
            }
        }

        Queue<Character> queue = new LinkedList<>();
        for (char c : indegree.keySet())
            if (indegree.get(c) == 0)
                queue.offer(c);

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            char c = queue.poll();
            sb.append(c);
            for (char next : graph.get(c)) {
                indegree.put(next, indegree.get(next) - 1);
                if (indegree.get(next) == 0)
                    queue.offer(next);
            }
        }
        return sb.length() == indegree.size() ? sb.toString() : "";
    }
}