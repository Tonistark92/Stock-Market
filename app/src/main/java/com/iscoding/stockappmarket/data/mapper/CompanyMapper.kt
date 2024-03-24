package com.iscoding.stockappmarket.data.mapper

import com.iscoding.stockappmarket.data.local.CompanyListingEntity
import com.iscoding.stockappmarket.data.remote.dto.CompanyInfoDto
import com.iscoding.stockappmarket.domain.model.CompanyInfo
import com.iscoding.stockappmarket.domain.model.CompanyListing


fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}