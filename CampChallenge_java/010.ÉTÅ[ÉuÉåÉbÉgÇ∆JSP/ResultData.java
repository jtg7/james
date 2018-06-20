/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author jamesgrimm
 */
public class ResultData implements Serializable{
    private Date d;
    private String luck;
    
    public ResultData(){}
    public Date getD(){//取得する処理
        return d;
    }
    public void setD(Date d){//日付をセットする処理
        this.d = d;
    }
    public String getLuck(){//取り出す処理
        return luck;
    }
    public void setLuck(String luck){
        this.luck = luck;
    }
}



