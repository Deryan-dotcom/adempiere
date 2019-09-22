/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Copyright (C) 2003-2014 e-Evolution,SC. All Rights Reserved.               *
 * Contributor(s): Victor Perez www.e-evolution.com                           *
 *****************************************************************************/
package org.eevolution.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Created by victor.perez@e-evolution.com, e-Evolution on 08/12/13.
 */
public class MHRAppraisalRating extends X_HR_AppraisalRating{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5510183130949842306L;

	public MHRAppraisalRating(Properties ctx, int HR_AppraisalRating_ID, String trxName) {
        super(ctx, HR_AppraisalRating_ID, trxName);
    }

    public MHRAppraisalRating(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
