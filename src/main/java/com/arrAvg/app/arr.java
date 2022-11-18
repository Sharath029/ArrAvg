package  main.java.com.arrAvg.app;
public class arr{
    public static int arrayAvg(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
                sum=sum+a[i];
        }
        return sum/a.length;

    }

}