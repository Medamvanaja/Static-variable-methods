public class Main{
    static int a=108;
    static int b;
    static void func(int c){
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    static{
        System.out.println("running static initilazation block");
        b= a+5;
    }
    public static void main(String args[]){
      func(118);    
    }
    
}
