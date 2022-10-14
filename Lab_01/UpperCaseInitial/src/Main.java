public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            if (!word.isEmpty()){
                String initial = String.valueOf(word.charAt(0));
                String substring = word.substring(1);
                String result = initial.toUpperCase()+substring;
                System.out.println(result);
            }
            else
                System.out.println();
        }
    }
}