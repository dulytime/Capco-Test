import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float target;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter number of Array : ");
        int n = a.nextInt();
        double []nums =new double[n+1];
        for (int i=0;i<n;i++){
            System.out.print("Enter number "+(i+1)+" : ");
            nums[i]=a.nextDouble();
        }
        System.out.print("Enter target : ");
        target = a.nextFloat();
        System.out.println("Answer = "+indicearray(nums, target));
    }
    public static int indicearray(double[]num,float target){
        int y=0,answer = 0;
        for (int x=0;x<num.length-1;x++){
            y=x+1;
            if (num[x]+num[y]==target){
                answer = x+y;
            }
        }
        return answer;
    }
}
