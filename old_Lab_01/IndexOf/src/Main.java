public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "sasso", "pippo", "test"};

        for (String word : words) {
            int position = -1;
            if (!word.isEmpty()){
                position = word.indexOf(word.charAt(0),1);
            }
            System.out.println(position);
        }
    }
}