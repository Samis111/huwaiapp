package it.cn.Strength.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一整个项目中Ajax请求返回的结果(未来也可以用于分布式架构的各个模块间调用返回的同一类型)
 *
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public   class ResultEntity<T>     {



    public static final String SUCCESS = "200";
    public static final String FAILED = "404";

    //用来封装当前请求处理的结果成功还是失败
    private String result;

    //请求处理失败的时候返回的错误消息
    private String message;

    //要返回的数据
    private T data;


    public  T getData() {
        return data;
    }
}
