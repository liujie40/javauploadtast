package java02;

public class jv02_12_ASCII코드 {
    public static void main(String[]args){
        int x = '4';
        int y = '5';
        int result = 0;
        
        result = x+y;
        System.out.println("더하기 :"+result);
        
        result = x-y;
        System.out.println("빼기 :"+result);
        
        result = x/y;
        System.out.println("나누기 :"+result);
        
        result = x*y;
        System.out.println("곱하기 :"+result);
        
        result = x%y;
        System.out.println("나머지값 :"+ result);
        
        result = y%x;
        System.out.println(result);
    }
}
