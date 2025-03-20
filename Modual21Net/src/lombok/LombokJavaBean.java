package lombok;

//重点
@Data//包含Tostring,hashCode,equals,无参构造
     //提高有参构造注解后;就无法使用无参构造;需要在提供无参构造注解

@Getter
@Setter
@ToString
@AllArgsConstructor//有参构造的注解
@NoArgsConstructor//无参构造注解
public class LombokJavaBean {
    private String name;
    private Integer age;
}
