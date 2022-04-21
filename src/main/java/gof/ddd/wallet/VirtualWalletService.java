package gof.ddd.wallet;

import java.math.BigDecimal;

/**
 * 
 * @since : 2022/3/10
 **/
public class VirtualWalletService {
    private VirtualWalletRepository walletRepo = new VirtualWalletRepository();
    private VirtualWalletTransactionRepository transactionRepository = new VirtualWalletTransactionRepository();

    public VirtualWallet getVirtualWallet(Long walletId) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = this.convert(walletEntity);
        return wallet;
    }

    public void debit(Long walletId, BigDecimal amount) {
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(walletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.debit(amount);
        walletRepo.updateBalance(walletId, wallet.balance());
    }

    public void credit(Long toWalletId, BigDecimal amount){
        VirtualWalletEntity walletEntity = walletRepo.getWalletEntity(toWalletId);
        VirtualWallet wallet = convert(walletEntity);
        wallet.credit(amount);
        walletRepo.updateBalance(toWalletId, wallet.balance());
    }

    public void transfer(Long fromWalletId, Long toWalletId, BigDecimal amount) {
        VirtualWalletTransactionEntity transactionEntity = new VirtualWalletTransactionEntity();
        /*transactionEntity.setAmount(amount);
        transactionEntity.setCreateTime(System.currentTimeMillis());
        transactionEntity.setFromWalletId(fromWalletId);
        transactionEntity.setToWalletId(toWalletId);
        transactionEntity.setStatus(Status.TO_BE_EXECUTED);*/
        Long transactionId = transactionRepository.saveTransaction(transactionEntity);
        try {
            this.debit(fromWalletId, amount);
            this.credit(toWalletId, amount);
        } catch (InsufficientBalanceException e) {
            //transactionRepository.updateStatus(transactionId, Status.CLOSED);
            throw new InsufficientBalanceException();
        } catch (Exception e) {
            //transactionRepo.updateStatus(transactionId, Status.FAILED);
        }
        //transactionRepo.updateStatus(transactionId, Status.EXECUTED);
    }

    public VirtualWallet convert(VirtualWalletEntity walletEntity){
        if (walletEntity == null){
            return null;
        }

        VirtualWallet wallet = new VirtualWallet(walletEntity.getId());
        wallet.setBalance(walletEntity.getBalance());
        wallet.setAllowedOverdraft(walletEntity.isAllowedOverdraft());
        wallet.setFrozenAmount(walletEntity.getFrozenAmount());
        wallet.setOverdraftAmount(walletEntity.getOverdraftAmount());
        return wallet;
    }
}
