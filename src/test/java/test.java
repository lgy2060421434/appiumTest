import org.junit.Test;

public class test {
    ThreadLocal<String> xt= new ThreadLocal<>();
    public String getName() {
        String s = xt.get();
        return s;
    }

    public void setName(String name) {
        this.name = name;
        xt.set(name);
    }

    private String name;


    @Test
    public void main() {
        test test =new test();
        for (int i =0;i<5;i++){
            Thread thread =new Thread(new Thread(){
                public void run(){
                    test.setName(Thread.currentThread().getName()+"aaa");
                    System.out.println("-----------------------");
                    System.out.println(Thread.currentThread().getName()+"----"+test.getName());
                }
            });
            thread.setName("线程："+i);
            thread.start();
        }



    }
}
