package com.iscoding.stockappmarket.di

import com.iscoding.stockappmarket.data.csv.CSVParser
import com.iscoding.stockappmarket.data.csv.CompanyListingsParser
import com.iscoding.stockappmarket.data.csv.IntradayInfoParser
import com.iscoding.stockappmarket.data.repo.StockRepositoryImpl
import com.iscoding.stockappmarket.domain.model.CompanyListing
import com.iscoding.stockappmarket.domain.model.IntradayInfo
import com.iscoding.stockappmarket.domain.repo.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}