package com.dwt.campaign.dto;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class CampaignMasterDto extends CampaignBaseDto {
    private Long id;
	
	private String code;
	
	private String description;
	
	private CampaignTypeDto campaignType;
	
	private CampaignStatusDto campaignStatus;
	
	private String campaignZone;
	
	private Instant startDate;
	
	private Instant endDate;
	
	private Instant priceStartDate;
	
	private Instant priceEndDate;
	
	private int numberOfPages;
	
	private int numberOfItems;
	
	private int unitSales;
	
	private BigDecimal sales;
	
	private BigDecimal promoMarginPercent;
}
