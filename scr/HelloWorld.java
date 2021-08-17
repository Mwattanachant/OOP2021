public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("Motana Yub");
        System.out.println("\n So idiots\n");
        int x=5;
        for(int n=1;n<=x;n++){
            for(int i=1;i+n<=x;i++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}