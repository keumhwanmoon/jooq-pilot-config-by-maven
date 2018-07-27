package project.pilot.jooq.common.vo;

import lombok.*;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVO {

    private String resultCode;
    private List resultList;
    private Object resultObject;
    private int resultCount;

    public static ResponseVO of(String resultCode, List resultList) {
        return ResponseVO.builder()
                .resultCode(resultCode)
                .resultList(resultList)
                .resultCount(resultList.size())
                .build();
    }

    public static ResponseVO of(String resultCode, Object resultObject) {
        return ResponseVO.builder()
                .resultCode(resultCode)
                .resultObject(resultObject)
                .resultCount(Objects.nonNull(resultObject) ? 1 : 0)
                .build();
    }

    public static ResponseVO of(String resultCode, int resultCount) {
        return ResponseVO.builder()
                .resultCode(resultCode)
                .resultCount(resultCount)
                .build();
    }
}
