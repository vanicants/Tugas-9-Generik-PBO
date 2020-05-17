public class GenericsTester {
   public static void main(String[] args) {
      Box<Integer, String> box = new Box<Integer, String>();
      box.add(Integer.valueOf(23),"Assalamualaikum");
      System.out.printf("Bilangan bulat :%d\n", box.getFirst());
      System.out.printf("Kata dalam String :%s\n", box.getSecond());

      Box<String, String> box1 = new Box<String, String>();
      box1.add("Pesan","Hello World");
      System.out.printf("Kata dalam String :%s\n", box1.getFirst());
      System.out.printf("Kata dalam String :%s\n", box1.getSecond());
   }
}

class Box<T, S> {
   private T t;
   private S s;

   public void add(T t, S s) {
      this.t = t;
      this.s = s;
   }

   public T getFirst() {
      return t;
   } 

   public S getSecond() {
      return s;
   } 
}

