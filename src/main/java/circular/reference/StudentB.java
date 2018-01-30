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
public class StudentB {
    private StudentC studentC ;

    public void setStudentC(StudentC studentC) {
        this.studentC = studentC;
    }

    public StudentB() {
    }

    public StudentB(StudentC studentC) {
        this.studentC = studentC;
    }
}
