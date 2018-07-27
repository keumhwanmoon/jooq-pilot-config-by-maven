package project.pilot.jooq.dealer.repository;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.jooq.tools.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.pilot.jooq.dealer.dto.DealerDTO;

import java.time.LocalDate;
import java.util.List;

import static project.pilot.jooq.model.tables.Dealer.DEALER;

@Repository
public class DealerRepository {
    private final DSLContext dsl;

    @Autowired
    public DealerRepository(DSLContext dsl) {
        this.dsl = dsl;
    }

    public int register(DealerDTO dealerDTO) {
        return dsl
                .insertInto(DEALER)
                .columns(DEALER.DEALER_ID, DEALER.DEALER_NAME, DEALER.SHOP_ID, DEALER.CREATE_DATE)
                .values(dealerDTO.getDealerId(), dealerDTO.getDealerName(), dealerDTO.getShopId(), java.sql.Date.valueOf(LocalDate.now()))
                .execute();
    }

    public DealerDTO getOne(String dealerId) {
        return dsl
                .select(DEALER.DEALER_ID, DEALER.DEALER_NAME, DEALER.SHOP_ID, DEALER.CREATE_DATE, DEALER.LAST_UPDATE_DATE)
                .from(DEALER)
                .where(DEALER.DEALER_ID.eq(dealerId))
                .fetchOne()
                .into(DealerDTO.class);
    }

    public List<DealerDTO> getList(DealerDTO dealerDTO) {
        Condition condition = DSL.trueCondition();

        if (!StringUtils.isBlank(dealerDTO.getShopId())) {
            condition.and(DEALER.SHOP_ID.eq(dealerDTO.getShopId()));
        }

        return dsl
                .select(DEALER.DEALER_ID, DEALER.DEALER_NAME, DEALER.SHOP_ID, DEALER.CREATE_DATE, DEALER.LAST_UPDATE_DATE)
                .from(DEALER)
                .where(condition)
                .fetch()
                .into(DealerDTO.class);
    }
}
