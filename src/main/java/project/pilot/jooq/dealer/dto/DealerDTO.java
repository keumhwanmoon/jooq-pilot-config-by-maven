package project.pilot.jooq.dealer.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DealerDTO {

    private String dealerName;
    private String dealerId;
    private String shopId;
    private Date createDate;
    private Date lastUpdateDate;
}
