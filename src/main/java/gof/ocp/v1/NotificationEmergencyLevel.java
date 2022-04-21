package gof.ocp.v1;

import java.util.Arrays;
import java.util.Optional;

/**
 * 
 * @since : 2022/3/10
 **/
public enum NotificationEmergencyLevel {
    URGENCY(1, "紧迫性"),
    SEVERE(2, "严重的");

    /**
     * 编码
     */
    private Integer code;
    /**
     * 描述
     */
    private String desc;

    NotificationEmergencyLevel(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static NotificationEmergencyLevel valueOfCode(Integer code) {
        if (code == null) {
            return null;
        }

        Optional<NotificationEmergencyLevel> first = Arrays.stream(NotificationEmergencyLevel.values())
                .filter(e -> e.getCode().equals(code))
                .findFirst();
        return first.orElse(null);
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
