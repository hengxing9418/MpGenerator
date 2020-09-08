package com.baomidou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YU.J
 * @since 2020-06-16
 */
public class TCookType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜名
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否启用，1：是，0：否
     */
    private String flag;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    public String getName() {
        return name;
    }

    public TCookType setName(String name) {
        this.name = name;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public TCookType setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public TCookType setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getFlag() {
        return flag;
    }

    public TCookType setFlag(String flag) {
        this.flag = flag;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public TCookType setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "TCookType{" +
        "name=" + name +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", flag=" + flag +
        ", id=" + id +
        "}";
    }
}
