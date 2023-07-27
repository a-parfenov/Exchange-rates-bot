package ru.parfenov.exchange_rates_bot.service;

import ru.parfenov.exchange_rates_bot.exception.ServiceException;

public interface ExchangeRatesService {

    String getUSDExchangeRate() throws ServiceException;
    String getEURExchangeRate() throws ServiceException;
}