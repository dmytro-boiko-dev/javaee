package datapackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class LofStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int message_filter_id;
    private String comment;
    private Boolean is_active;
    private Boolean has_error;
    private Boolean is_recrawled;
    private Boolean is_header_data_ready;
    private Boolean is_clusterized;
    private Boolean is_fetched;
    private Boolean is_bbx_tagged;
    private Boolean is_ready_for_afc;
    private Boolean is_afc_processed;
    private Boolean is_afd_processed;
    private Date lof_create_time;
    private int tagging_task_id;

    public int getMessage_filter_id() {
        return message_filter_id;
    }

    public void setMessage_filter_id(int message_filter_id) {
        this.message_filter_id = message_filter_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Boolean getHas_error() {
        return has_error;
    }

    public void setHas_error(Boolean has_error) {
        this.has_error = has_error;
    }

    public Boolean getIs_recrawled() {
        return is_recrawled;
    }

    public void setIs_recrawled(Boolean is_recrawled) {
        this.is_recrawled = is_recrawled;
    }

    public Boolean getIs_header_data_ready() {
        return is_header_data_ready;
    }

    public void setIs_header_data_ready(Boolean is_header_data_ready) {
        this.is_header_data_ready = is_header_data_ready;
    }

    public Boolean getIs_clusterized() {
        return is_clusterized;
    }

    public void setIs_clusterized(Boolean is_clusterized) {
        this.is_clusterized = is_clusterized;
    }

    public Boolean getIs_fetched() {
        return is_fetched;
    }

    public void setIs_fetched(Boolean is_fetched) {
        this.is_fetched = is_fetched;
    }

    public Boolean getIs_bbx_tagged() {
        return is_bbx_tagged;
    }

    public void setIs_bbx_tagged(Boolean is_bbx_tagged) {
        this.is_bbx_tagged = is_bbx_tagged;
    }

    public Boolean getIs_ready_for_afc() {
        return is_ready_for_afc;
    }

    public void setIs_ready_for_afc(Boolean is_ready_for_afc) {
        this.is_ready_for_afc = is_ready_for_afc;
    }

    public Boolean getIs_afc_processed() {
        return is_afc_processed;
    }

    public void setIs_afc_processed(Boolean is_afc_processed) {
        this.is_afc_processed = is_afc_processed;
    }

    public Boolean getIs_afd_processed() {
        return is_afd_processed;
    }

    public void setIs_afd_processed(Boolean is_afd_processed) {
        this.is_afd_processed = is_afd_processed;
    }

    public Date getLof_create_time() {
        return lof_create_time;
    }

    public void setLof_create_time(Date lof_create_time) {
        this.lof_create_time = lof_create_time;
    }

    public int getTagging_task_id() {
        return tagging_task_id;
    }

    public void setTagging_task_id(int tagging_task_id) {
        this.tagging_task_id = tagging_task_id;
    }
}
