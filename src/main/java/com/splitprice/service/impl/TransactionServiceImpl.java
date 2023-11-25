package com.splitprice.service.impl;

import com.splitprice.domain.Transaction;
import com.splitprice.repository.TransactionRepository;
import com.splitprice.service.TransactionService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Transaction}.
 */
@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

    private final Logger log = LoggerFactory.getLogger(TransactionServiceImpl.class);

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction save(Transaction transaction) {
        log.debug("Request to save Transaction : {}", transaction);
        return transactionRepository.save(transaction);
    }

    @Override
    public Transaction update(Transaction transaction) {
        log.debug("Request to update Transaction : {}", transaction);
        return transactionRepository.save(transaction);
    }

    @Override
    public Optional<Transaction> partialUpdate(Transaction transaction) {
        log.debug("Request to partially update Transaction : {}", transaction);

        return transactionRepository
            .findById(transaction.getId())
            .map(existingTransaction -> {
                if (transaction.getFromUserName() != null) {
                    existingTransaction.setFromUserName(transaction.getFromUserName());
                }
                if (transaction.getAmount() != null) {
                    existingTransaction.setAmount(transaction.getAmount());
                }
                if (transaction.getUserId() != null) {
                    existingTransaction.setUserId(transaction.getUserId());
                }
                if (transaction.getStatus() != null) {
                    existingTransaction.setStatus(transaction.getStatus());
                }

                return existingTransaction;
            })
            .map(transactionRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Transaction> findAll() {
        log.debug("Request to get all Transactions");
        return transactionRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Transaction> findOne(Long id) {
        log.debug("Request to get Transaction : {}", id);
        return transactionRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Transaction : {}", id);
        transactionRepository.deleteById(id);
    }
}
