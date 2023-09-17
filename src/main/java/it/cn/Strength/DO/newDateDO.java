package it.cn.Strength.DO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class newDateDO<T> {

    private String orders;

    private Integer   pages;

    private Integer current;

    private List<RecordsDO> records;


}
