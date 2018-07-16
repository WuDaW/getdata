package com.zk.jy.utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class JsonUtil {

    public static JSONArray formatRsToJsonArray(ResultSet rs) throws Exception {
        ResultSetMetaData md = rs.getMetaData();
        int num = md.getColumnCount();
        JSONArray array = new JSONArray();
        while(rs.next()){
            JSONObject mapOfColValues = new JSONObject();
            for(int i = 1; i <= num; i++){
                mapOfColValues.put(md.getColumnName(i), rs.getObject(i));
            }
            array.put(mapOfColValues);
        }
        return array;
    }
}
