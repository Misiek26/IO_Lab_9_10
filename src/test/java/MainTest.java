import org.junit.Test;

public class MainTest {

    int a=20;
    int b=20;

    @Test
    public void firstTest(){
        if(a>b)
            System.out.println(a>b);
    }

    @Test
    public void secondTest(){
        int c = a+b;
        if(c>10){
            System.out.println(c);
        }
    }

}
