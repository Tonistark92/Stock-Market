package com.iscoding.stockappmarket.presentation.company_info

import com.iscoding.stockappmarket.domain.model.CompanyInfo
import com.iscoding.stockappmarket.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)