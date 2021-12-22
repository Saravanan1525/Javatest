package corejava;

public class E16ForEach {
   public static void main(String[] args) {
      int[] intary = { 1,2,3,4,5,6,7,8,9,10};

      foreachDisplay(intary);
   }
   public static void foreachDisplay(int[] data) {
      System.out.println("Display an array using for each loop");
      for (int a  : data) {
         System.out.print(a+ " ");
      }
   }
}