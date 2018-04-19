package datapackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TaggingTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private int cluster_count;
    private Date last_modified_time;
    private int lof_count;
    private int merchant_id;
    private String merchant_name;
    private int messages_count;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCluster_count() {
        return cluster_count;
    }

    public void setCluster_count(int cluster_count) {
        this.cluster_count = cluster_count;
    }

    public Date getLast_modified_time() {
        return last_modified_time;
    }

    public void setLast_modified_time(Date last_modified_time) {
        this.last_modified_time = last_modified_time;
    }

    public int getLof_count() {
        return lof_count;
    }

    public void setLof_count(int lof_count) {
        this.lof_count = lof_count;
    }

    public int getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public int getMessages_count() {
        return messages_count;
    }

    public void setMessages_count(int messages_count) {
        this.messages_count = messages_count;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
