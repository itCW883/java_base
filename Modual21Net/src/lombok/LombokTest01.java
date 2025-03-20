package lombok;

public class LombokTest01 {
    public static void main(String[] args) {
        LombokJavaBean lombok = new LombokJavaBean();
        lombok.setAge(100);
        lombok.setName("马哥");

        System.out.println(lombok.getAge() + "......" + lombok.getName());
        LombokJavaBean sph = new LombokJavaBean("瘦皮猴", 99);
        System.out.println(sph.getAge()+"...."+sph.getName());
    }
}
