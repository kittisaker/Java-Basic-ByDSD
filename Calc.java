class Calc {
    public static void main(String[] args) {
        int c = 0;
        int len = args.length;

        switch(args[0]){
            case "add":
                int a = (len >= 2) ? Integer.parseInt(args[1]) : 0;
                int b = (len >= 3) ? Integer.parseInt(args[2]) : 0;
                c = a + b;
                break;
            default:
                System.out.println("Not support");
                break;
        }
        System.out.println("Value = " +c);
    } 
}