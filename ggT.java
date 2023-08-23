public class ggT {
    static void ggT(int a,int b){
        while (a!=b){
            if(a<b){b=b-a;}
            else {a=a-b;}
        }
        System.out.println(a);
    }
    public static void main(String[]args){
        ggT(80,70);
    }
}
