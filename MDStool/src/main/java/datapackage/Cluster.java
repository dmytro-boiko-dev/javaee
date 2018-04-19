package datapackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cluster {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String common_tag;
    private String from_addr;
    private String subject;
    private int num_messages;

    public String getCommon_tag() {
        return common_tag;
    }

    public void setCommon_tag(String common_tag) {
        this.common_tag = common_tag;
    }

    public String getFrom_addr() {
        return from_addr;
    }

    public void setFrom_addr(String from_addr) {
        this.from_addr = from_addr;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNum_messages() {
        return num_messages;
    }

    public void setNum_messages(int num_messages) {
        this.num_messages = num_messages;
    }
}
