package com.hk.hksales.service;

import com.hk.hksales.dto.listing.ListingPageResponse;
import com.hk.hksales.dto.listing.ListingRequest;
import com.hk.hksales.dto.product.VariantDetail;
import com.hk.hksales.util.Rest;
import com.hk.hksales.util.RestAPIType;
import com.hk.hksales.util.Routes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Override
    public List<VariantDetail> getVariantList(ListingRequest listingRequest) {
        ListingPageResponse listingPageResponse = Rest.exec(Routes.listingPath + "/" + listingRequest.getPageNumber(), null, RestAPIType.GET.toString(), ListingPageResponse.class, null);
        return listingPageResponse.getResultList();
    }
}
