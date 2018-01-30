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
public class StudentC {
    private StudentA studentA ;

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }

    public StudentC() {
    }

    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }
}
