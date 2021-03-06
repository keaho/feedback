package dnn.enums;

/**
 * Created by lgq on 16-9-4.
 */
public enum Status {
    THAW(0)//解冻
    , CONGEAL(1)//冻结
    , DELETE(2)//删除
    ;

    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
