public class Expressions {
    public static void main(String[] args){
        //EXPRESSION-1
        int x=2%2+2*2-2/2;
        System.out.println("Value of x is "+x);
        //EXPRESSION-2
        int a=4,b=5,c=6;
        boolean res=((a<b)||(b>c)&&(a>b)||(!(a>c)));
        System.out.println(res);
        //EXPRESSION-3
        int i=8,j=5;
        double X=0.005,Y=-0.01;
        double re=5*((i/7)+(j*(i-3))%(X+Y-2+i));
        System.out.println(re);
        //EXPRESSION-4
        int x1=10;
        int y1=--x1*x1--;
        System.out.println(y1);
        //EXPRESSION-5
        int t=6,y2=7*t+2;
        System.out.println(y2);
    }
}
