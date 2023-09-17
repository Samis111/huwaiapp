package it.cn.Strength.VO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName camp_records
 */
@TableName(value ="camp_records")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CampRecords implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer campgroundtypeid;

    /**
     * 
     */
    private Integer recordsid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CampRecords other = (CampRecords) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCampgroundtypeid() == null ? other.getCampgroundtypeid() == null : this.getCampgroundtypeid().equals(other.getCampgroundtypeid()))
            && (this.getRecordsid() == null ? other.getRecordsid() == null : this.getRecordsid().equals(other.getRecordsid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCampgroundtypeid() == null) ? 0 : getCampgroundtypeid().hashCode());
        result = prime * result + ((getRecordsid() == null) ? 0 : getRecordsid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", campgroundtypeid=").append(campgroundtypeid);
        sb.append(", recordsid=").append(recordsid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}