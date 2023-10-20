public class tugassofi {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            System.out.println("*");
        }
        for(int y = 1;y<=5;y++){
            for(int z = 1;z<=y;z++){
                System.out.print(z+"*");
            }
            System.out.println();
        }
    }
}
