package java04;

public class jv04_11_구구단세로출력 {
    public static void main(String[] args){
        int sum=0;
        for(int i=2; i<=9; i=i+1){
            for(int j=1; j<=9; j=j+1){
                sum=j*i;
                System.out.println(i+"*"+j+"="+sum);
            }
        }
    }
    
}
