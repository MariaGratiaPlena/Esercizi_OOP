public class Main {
   public static void main(String[] args) {
      String[] words = {"c","ac","ciao","pippo"};

      for (String word : words) {
         String result = word;

         if(result.length() >1) {
            String first = result.substring(0, (result.length() / 2));
            String last = result.substring(result.length() / 2);
            result = last + first;
         }
         else result = "Stringa corta";

         System.out.println(result);

      }
   }
}