public class Test {
    public static void main(String[] args)  {
        int cout = 0;
        for (int i = 1;i < 1000;i++){
            if(i%3 == 0 || i%5 == 0){
                cout += i;
            }
        }
        System.out.println(cout);
    }
}
