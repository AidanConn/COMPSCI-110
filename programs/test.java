public class test {
    public static void main(String args[]){
        int x = 3, y = 1;
        switch (y) {
            case 1 -> x += 4;
            case 2 -> {
                x += 7;
            }
            case 3 -> x += 10;
            default -> x += 15;
        }
        System.out.println(x);
    }
}
