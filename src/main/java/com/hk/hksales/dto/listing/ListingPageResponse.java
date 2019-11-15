package com.hk.hksales.dto.listing;

import com.hk.hksales.dto.product.VariantDetail;

import java.util.List;

public class ListingPageResponse {

    private List<VariantDetail> resultList;

    public List<VariantDetail> getResultList() {
        return resultList;
    }

    public void setResultList(List<VariantDetail> resultList) {
        this.resultList = resultList;
    }
}
