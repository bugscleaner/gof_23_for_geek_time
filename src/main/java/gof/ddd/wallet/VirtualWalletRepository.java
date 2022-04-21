package gof.ddd.wallet;

import java.math.BigDecimal;

/**
 * 
 * @since : 2022/3/10
 **/
public class VirtualWalletRepository {
    public VirtualWalletEntity getWalletEntity(Long entityId){
        VirtualWalletEntity entity = new VirtualWalletEntity();
        return entity;
    }

    public void updateBalance(long walletId, BigDecimal balance){

    }
}
