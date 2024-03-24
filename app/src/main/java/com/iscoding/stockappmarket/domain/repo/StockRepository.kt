package com.iscoding.stockappmarket.domain.repo


import com.iscoding.stockappmarket.domain.model.CompanyInfo
import com.iscoding.stockappmarket.domain.model.CompanyListing
import com.iscoding.stockappmarket.domain.model.IntradayInfo
import com.iscoding.stockappmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}