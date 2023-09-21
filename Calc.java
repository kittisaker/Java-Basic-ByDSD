class Calc {

    public static int add(int a, int b){
        return a + b;
    }

    public static int sum(int[] numbers){
        int result = 0;
        for(int num : numbers){
            result += num;
        }
        return result;
    }
    public static void main(String[] args) {
        int c = 0;
        int len = args.length;

        switch(args[0]){
            case "add":
                int a = (len >= 2) ? Integer.parseInt(args[1]) : 0;
                int b = (len >= 3) ? Integer.parseInt(args[2]) : 0;
                c = add(a, b);
                break;
            case "sum":
                int nums[] = new int[len];
                for(int i = 1; i<len; i++){
                    nums[i - 1] = Integer.parseInt(args[i]);
                }
                c = sum(nums);
                break;
            default:
                System.out.println("Not support");
                break;
        }
        System.out.println("Value = " +c);
    } 
}