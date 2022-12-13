package com.sp.reactive.service;

import com.sp.reactive.repository.CryptoData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cryptoClient",
        url = "https://api.kucoin.com/api/v1/market/stats")
public interface CryptoClient {

    String CRYPTO_BTC_TO_USDT = "?symbol=BTC-USDT";
    String CRYPTO_ETH_TO_USDT = "?symbol=ETH-USDT";

    @GetMapping(path = CRYPTO_BTC_TO_USDT, consumes = MediaType.APPLICATION_JSON_VALUE)
    CryptoData getBTCToUSDT();

    @GetMapping(path = CRYPTO_ETH_TO_USDT, consumes = MediaType.APPLICATION_JSON_VALUE)
    CryptoData getETHToUSDT();


}
