package gof.ddd.wallet;

import java.math.BigDecimal;

/**
 * 
 * @since : 2022/3/10
 **/
public class VirtualWalletEntity {
    private Long id;

    private Long createTime = System.currentTimeMillis();

    private boolean isAllowedOverdraft;

    private BigDecimal overdraftAmount;

    private BigDecimal frozenAmount;

    private BigDecimal balance;

    public boolean isAllowedOverdraft() {
        return isAllowedOverdraft;
    }

    public void setAllowedOverdraft(boolean allowedOverdraft) {
        isAllowedOverdraft = allowedOverdraft;
    }

    public BigDecimal getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(BigDecimal overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
