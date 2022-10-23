public class Main {
    public static void main(String[] args) {
        String[] words = {"c","ac","pippo"};

        for (String word : words) {
            String result = word;
            String first, middle, last;
            if(word.length()>1) {
                first = result.substring(0,1);
                middle = result.substring(1,result.length()-1);
                last = result.substring(result.length()-1);
                result = last+middle+first;
            }
            else result = "Stringa corta";

            System.out.println(result);
        }
    }
}