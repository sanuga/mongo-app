package com.sp.reactive.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sp.reactive.repository.CryptoData;
import com.sp.reactive.repository.CryptoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@RequiredArgsConstructor
public class CryptoSync {
    private final CryptoClient cryptoClient;
    private final CryptoRepository cryptoRepository;

    @Transactional
//    @Scheduled(cron = "*/5 * * * * ?")
    public void syncCrypto() throws JsonProcessingException {
        CryptoData btcToUSDT = cryptoClient.getBTCToUSDT();
        CryptoData ethToUSDT = cryptoClient.getETHToUSDT();
        cryptoRepository.save(btcToUSDT.getData());
        cryptoRepository.save(ethToUSDT.getData());
    }
}
