package apitests;

import apiresources.CryptocurrencyApi;
import models.cryptocurrency.CurrentBitcoinPrice;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CryptocurrencyTest {

    @Test
    public void currentBitcoinPriceTest() {

        CurrentBitcoinPrice currentBitcoinPrice = CryptocurrencyApi.getCurrentBitcoinPriceApi();

        assertThat(currentBitcoinPrice.getDisclaimer().contains("This data was produced from the CoinDesk Bitcoin Price Index")).isTrue();
        assertThat(currentBitcoinPrice.getBpi().getUsd().getCode().equals("USD")).isTrue();
        assertThat(currentBitcoinPrice.getBpi().getUsd().getDescription().equals("United States Dollar")).isTrue();
        assertThat(currentBitcoinPrice.getBpi().getGbp().getCode().equals("GBP")).isTrue();
        assertThat(currentBitcoinPrice.getBpi().getEur().getCode().equals("EUR")).isTrue();
    }
}