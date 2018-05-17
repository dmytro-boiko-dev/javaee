package com.jsf;

import com.dao.UserDAO;
import com.models.TaggingTaskEntity;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Named("ttManagedBean")
@RequestScoped
public class TaggingTaskManagedBean implements Serializable {

    @Inject
    private UserDAO userDao;

    private int id;
    private Long clusterCount;
    private Timestamp lastModifiedTime;
    private Integer lofCount;
    private Integer merchantId;
    private String merchantName;
    private Long messagesCount;
    private String status;
    private Integer userId;

    public List<TaggingTaskEntity> data() {
        return userDao.getAllUsers();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getClusterCount() {
        return clusterCount;
    }

    public void setClusterCount(Long clusterCount) {
        this.clusterCount = clusterCount;
    }

    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Integer getLofCount() {
        return lofCount;
    }

    public void setLofCount(Integer lofCount) {
        this.lofCount = lofCount;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Long getMessagesCount() {
        return messagesCount;
    }

    public void setMessagesCount(Long messagesCount) {
        this.messagesCount = messagesCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}