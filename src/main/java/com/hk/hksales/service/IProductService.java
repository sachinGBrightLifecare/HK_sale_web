package com.hk.hksales.service;

import com.hk.hksales.dto.listing.ListingRequest;
import com.hk.hksales.dto.product.VariantDetail;

import java.util.List;

public interface IProductService {

    public List<VariantDetail> getVariantList(ListingRequest listingRequest);

}
