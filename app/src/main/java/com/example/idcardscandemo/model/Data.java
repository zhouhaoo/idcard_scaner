package com.example.idcardscandemo.model;

import java.util.List;

/**
 * Created by zhou on 17/2/14.
 * 识别结果
 */

public class Data {


    public String status;
    public DataBean data;

    public static class DataBean {
        public String facade;
        public ItemBean item;

        public static class ItemBean {
            public String name;
            public String cardno;
            public String sex;
            public String folk;
            public String birthday;
            public String address;
            public List<?> issue_authority;
            public List<?> valid_period;
            public List<?> header_pic;
        }
    }
}
