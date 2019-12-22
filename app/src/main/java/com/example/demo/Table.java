
package com.example.demo;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Table {

    @SerializedName("EmailId")
    private String mEmailId;
    @SerializedName("EntityId")
    private int mEntityId;
    @SerializedName("EntityName")
    private String mEntityName;
    @SerializedName("EntityPassword")
    private String mEntityPassword;
    @SerializedName("EntityType")
    private String mEntityType;
    @SerializedName("MobileNo")
    private String mMobileNo;

    public String getEmailId() {
        return mEmailId;
    }

    public void setEmailId(String emailId) {
        mEmailId = emailId;
    }

    public int getEntityId() {
        return mEntityId;
    }

    public void setEntityId(int entityId) {
        mEntityId = entityId;
    }

    public String getEntityName() {
        return mEntityName;
    }

    public void setEntityName(String entityName) {
        mEntityName = entityName;
    }

    public String getEntityPassword() {
        return mEntityPassword;
    }

    public void setEntityPassword(String entityPassword) {
        mEntityPassword = entityPassword;
    }

    public String getEntityType() {
        return mEntityType;
    }

    public void setEntityType(String entityType) {
        mEntityType = entityType;
    }

    public String getMobileNo() {
        return mMobileNo;
    }

    public void setMobileNo(String mobileNo) {
        mMobileNo = mobileNo;
    }

}
