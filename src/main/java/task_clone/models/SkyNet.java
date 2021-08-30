package task_clone.models;

import java.util.Date;

/**
 *  2) аналогично переделай программу из пункта 1 так , чтобы ты стал использовать глубокое клонирование
 */

public class SkyNet implements Cloneable {
    private Date birthday;

    public SkyNet(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected SkyNet clone() throws CloneNotSupportedException {
        return (SkyNet) super.clone();
    }

    @Override
    public String toString() {
        return "SkyNet{" +
                "birthday=" + birthday +
                '}';
    }
}
