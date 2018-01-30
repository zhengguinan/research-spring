package circular.reference;

/**
 * <p>Title: research-spring</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: www.jd.com</p>
 *
 * @author zhengguinan
 * @version 1.0
 * @date 2018/1/30
 */
public class StudentA {
    private StudentB studentB ;

    public void setStudentB(StudentB studentB) {
        this.studentB = studentB;
    }

    public StudentA() {
    }

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }
}
