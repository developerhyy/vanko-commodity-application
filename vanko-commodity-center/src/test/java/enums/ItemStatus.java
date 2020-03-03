package enums;

public enum ItemStatus {
    PUT_REDLY(0,"待上架"),
    PUT_ON(1, "已上架"),
    PUT_OFF(7, "未上架");
    private Integer code;
    private String msg;

    ItemStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}