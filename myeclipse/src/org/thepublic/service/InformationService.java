package org.thepublic.service;

import org.dao.BaseDao;
import org.thepublic.pojo.Information;

public class InformationService extends ThePublicServiceImpl<Information>
{

	/* £¨·Ç Javadoc£©
	 * @see org.thepublic.service.ThePublicServiceImpl#setDao(org.dao.BaseDao)
	 */
	@Override
	public void setDao(BaseDao<Information, Integer> dao)
	{
		super.dao =  (BaseDao<Information, Integer>) dao;
		super.dao.setEntityClass(Information.class);
	}

}
