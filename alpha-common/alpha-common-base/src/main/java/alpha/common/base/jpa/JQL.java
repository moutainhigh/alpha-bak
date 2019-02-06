package alpha.common.base.jpa;

import lombok.NonNull;

/**
 * Created by tanghaiyang on 2019/1/3.
 */
public class JQL {

    public static String likeWrap(@NonNull String value) {
        return "%" + value + "%";
    }

    public static String likeWrapLeft(@NonNull String value) {
        return "%" + value;
    }

    public static String likeWrapRight(@NonNull String value) {
        return value + "%";
    }
}