package Java_AOP;

public class PerformanceMovie implements Performance {
    @Override
    public void perform(){
        System.out.println("LOL");

        try {
            int i = 1/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
