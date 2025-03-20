package nextJDK8;

public class h_teat {
    public static void main(String[] args) {
        h_Record_Person p1 = new h_Record_Person("马哥");
        h_Record_Person p2 = new h_Record_Person("马哥");
        System.out.println("p1 = " + p1);
        System.out.println("p1.equals(p2) = " + p1.equals(p2));//提供了equals方法
    }
}
