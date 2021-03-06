/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 2015/05/18 13:25:59
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.commercewebservicescommons.dto.product;

import de.hybris.platform.commercewebservicescommons.dto.product.VariantCategoryWsDTO;
import java.util.Collection;

public class VariantValueCategoryWsDTO  implements java.io.Serializable 
{

	/** <i>Generated property</i> for <code>VariantValueCategoryWsDTO.superCategories</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Collection<VariantCategoryWsDTO> superCategories;
	/** <i>Generated property</i> for <code>VariantValueCategoryWsDTO.sequence</code> property defined at extension <code>commercewebservicescommons</code>. */
	private Integer sequence;
	/** <i>Generated property</i> for <code>VariantValueCategoryWsDTO.name</code> property defined at extension <code>commercewebservicescommons</code>. */
	private String name;
		
	public VariantValueCategoryWsDTO()
	{
		// default constructor
	}
	
		
	public void setSuperCategories(final Collection<VariantCategoryWsDTO> superCategories)
	{
		this.superCategories = superCategories;
	}
	
		
	public Collection<VariantCategoryWsDTO> getSuperCategories() 
	{
		return superCategories;
	}
		
		
	public void setSequence(final Integer sequence)
	{
		this.sequence = sequence;
	}
	
		
	public Integer getSequence() 
	{
		return sequence;
	}
		
		
	public void setName(final String name)
	{
		this.name = name;
	}
	
		
	public String getName() 
	{
		return name;
	}
		
	
}