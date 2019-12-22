
package com.example.demo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class LoginResponse {

    @SerializedName("Table")
    private List<Table> mTable;

    public List<Table> getTable() {
        return mTable;
    }

    public void setTable(List<Table> table) {
        mTable = table;
    }

}
