package it.cn.Strength.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName province
 */
@TableName(value ="province")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProvinceDO implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer count;

    /**
     * 地理
     */
    private String province;

    /**
     * 城市
     */
    private String key;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;





}